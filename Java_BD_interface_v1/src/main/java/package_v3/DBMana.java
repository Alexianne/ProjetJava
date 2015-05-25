package package_v3;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;

//connectDB();  Connexion à la BDD
//AddRoom(Room); Ajouter une Room à la BDD

public class DBMana {
    static Connection cnx;
    static Statement stat;
    static ResultSet rst;
		
    public static Connection connectDB(){
        try {
            String url = "jdbc:mysql://localhost:3306/TPjava2";
            String user = "test";
            String passwd = "pass";

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver OK");

            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion effective !");         
            return conn;
        } 
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
		
    public static void AddDBRoom(Room room1){
        try{
            String query = "INSERT INTO Rooms VALUES ('"+room1.getSiteName()+"','"+room1.getNumRoom()+"','"+room1.getTypeRoom()+"')"; 
            cnx = connectDB();
            stat=cnx.createStatement();
            stat.executeUpdate(query);
            System.out.println("Produit bien ajouté ! ");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
		
    public static void AddDBDev(Devices dev){
        try{	
            String query = "INSERT INTO Devices VALUES ('"+dev.getDevName()+"','"+dev.getTypeDev()+"','"+dev.getOS()+"','"+dev.getSiteName()+"','"+dev.getNumRoom()+"')"; 
            cnx = connectDB();
            stat=cnx.createStatement();
            stat.executeUpdate(query);
            System.out.println("Périphérique bien ajouté ! ");	
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void AddDBNC(NetworkCard nc){
        try{
            String query = "INSERT INTO NetworkCards VALUES ('"+nc.getDevName()+"','"+nc.getIntercoDevName()+"','"+nc.getMacAddr()+"','"+nc.getIpAddr()+"')"; 
            cnx = connectDB();
            stat=cnx.createStatement();
            stat.executeUpdate(query);
            System.out.println("Carte réseau bien ajoutée ! ");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }	
    }

    // A MODIFIER : setDBMacAddr(NetworkCard nc, String constr)
    /*public static void setDBConstr(NetworkCard nc){
        try{
            String temp = nc.getIdcard().substring(0, 6);
            System.out.println(temp);
            String query = "SELECT ConstrName FROM Constructeurs WHERE IDCard='"+temp+"'"; 

            cnx = connectDB();
            stat=cnx.createStatement();
            rst = stat.executeQuery(query);
            String result = null;
            while (rst.next())
            {
               result = rst.getString(1);

            }
            System.out.println(result);
            nc.setConstr(result);

            String setconstr = "UPDATE NetworkCard SET Constr='"+nc.getConstr()+"' WHERE IDCard='"+nc.getIdcard()+"'  ";
            stat.execute(setconstr);
            System.out.println("ID Constructeur changé ! ");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }*/

    public static Integer getDBNbRoom(Site site) {
        try{
            cnx=DBMana.connectDB();
            stat=cnx.createStatement();
            String query = "SELECT COUNT(*) FROM Rooms WHERE SiteName='"+site.getSiteName()+"'";
            rst = cnx.createStatement().executeQuery(query);
            int result =0;
            while (rst.next())
            {
                result = rst.getInt(1);
            }			
            return result;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

		
    public static void AddDBSite(Site site) {
        try{
            cnx=connectDB();
            stat=cnx.createStatement();
            site.setNbRoom(getDBNbRoom(site));
            String query = "INSERT INTO Sites VALUES('"+site.getSiteName()+"','"+site.getAddress()+"')";
            stat.execute(query);					
        }catch(SQLException e){
            e.printStackTrace();
        }		
    }
                
    public static DefaultComboBoxModel selectDBSite(DefaultComboBoxModel listSite) {
        try{
            String query = "SELECT SiteName FROM Sites";
            cnx = DBMana.connectDB();
            stat=cnx.createStatement();
            rst = stat.executeQuery(query);
            String result = null;
            while (rst.next())
            {
                result = rst.getString(1);
                listSite.addElement(result);
                System.out.println("selected site : "+result);
            }
            return listSite;
         }
         catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    static boolean roomExist(String roomNum, String siteName) {
        try{
            cnx=DBMana.connectDB();
            stat=cnx.createStatement();
            String query = "SELECT COUNT(*) FROM Rooms WHERE SiteName='"+siteName+"'";
            rst = stat.executeQuery(query);
            int result =0;
            while (rst.next())
            {
                result = rst.getInt(1);
            }
            System.out.println(result);
            if(result == 0){
                return true;
            }
            else{
                String query2 = "SELECT COUNT(*) FROM Rooms WHERE NumRoom='"+roomNum+"'";
                rst = stat.executeQuery(query2);
                int result2 =0;
                while (rst.next())
                {
                   result2 = rst.getInt(1);
                }
                System.out.println(result2);
                if(result2 == 0){
                    return true;
                }else{
                    return false;
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
	}
    }

    public static DefaultComboBoxModel selectDBRoom(DefaultComboBoxModel listSite, String siteName) {
        try{
            String query = "SELECT NumRoom FROM Rooms WHERE SiteName='"+siteName+"'";
            cnx = DBMana.connectDB();
            stat=cnx.createStatement();
            rst = stat.executeQuery(query);
            String result = null;
            while (rst.next())
            {
                result = rst.getString(1);
                listSite.addElement(result);
				   
            }
            return listSite;
        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    static boolean intercoDevExist(String intercoDevName, String siteName, String roomNum) {
        try{
            cnx=DBMana.connectDB();
            stat=cnx.createStatement();
            String query = "SELECT COUNT(*) FROM IntercoDev WHERE SiteName='"+siteName+"' AND NumRoom='"+roomNum+"'";
            rst = stat.executeQuery(query);
            int result =0;
            while (rst.next())
            {
                result = rst.getInt(1);
            }
            System.out.println(result);
            if(result == 0){
                return true;
            }
            else{
                String query2 = "SELECT COUNT(*) FROM IntercoDev WHERE IntercoDevName='"+intercoDevName+"'";
                rst = stat.executeQuery(query2);
                int result2 =0;
                while (rst.next())
                {
                   result2 = rst.getInt(1);
                }
                System.out.println(result2);
                if(result2 == 0){
                    return true;
                }else{
                    return false;
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
	}
    }
	
}
