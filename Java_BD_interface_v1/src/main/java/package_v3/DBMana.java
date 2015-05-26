package package_v3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
	
    /**
     *
     * @param query
     * @return
     */
    public static ResultSet selectDB(String query){
        try {
            cnx = connectDB();
            stat=cnx.createStatement();
            rst = stat.executeQuery(query);
        } 
        catch (Exception e) {
        }
        return rst;
     }
     
      public static boolean insertDB(String query){
        try {
            cnx = connectDB();
            stat=cnx.createStatement();
            stat.executeUpdate(query);
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }
    
    
    
    public static void AddDBRoom(Room room1){
        String query = "INSERT INTO Rooms VALUES ('"+room1.getSiteName()+"','"+room1.getNumRoom()+"','"+room1.getTypeRoom()+"')";
        insertDB(query);
        System.out.println("Produit bien ajouté ! ");
    }
		
    public static void AddDBDev(Devices dev){
        String query = "INSERT INTO Devices VALUES ('"+dev.getDevName()+"','"+dev.getTypeDev()+"','"+dev.getOS()+"','"+dev.getSiteName()+"','"+dev.getNumRoom()+"')";
        insertDB(query);
        System.out.println("Périphérique bien ajouté ! ");
    }

    public static void AddDBNC(NetworkCard nc){
        String query = "INSERT INTO NetworkCards VALUES ('"+nc.getDevName()+"','"+nc.getIntercoDevName()+"','"+nc.getMacAddr()+"','"+nc.getIpAddr()+"')";
        insertDB(query);
        System.out.println("Carte réseau bien ajoutée ! ");	
    }
/*
    // A MODIFIER : setDBMacAddr(NetworkCard nc, String constr)
    public static void setDBConstr(NetworkCard nc, String constr){
        try{
            //String temp = nc.getDevName().substring(0, 6);
            String query = "SELECT IDCard FROM Constructeurs WHERE ConstrName='"+constr+"'"; 

            cnx = connectDB();
            stat=cnx.createStatement();
            rst = stat.executeQuery(query);
            String result = null;
            while (rst.next())
            {
               result = rst.getString(1);

            }
            
            nc.setMacAddr(result);

            String setconstr = "UPDATE NetworkCard SET Constr='"+nc.getConstr()+"' WHERE IDCard='"+nc.getIdcard()+"'  ";
            stat.execute(setconstr);
            System.out.println("ID Constructeur changé ! ");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
*/
    public static Integer getDBNbRoom(Site site) throws SQLException {
        
            String query = "SELECT COUNT(*) FROM Rooms WHERE SiteName='"+site.getSiteName()+"'";
            rst = selectDB(query);
            int result =0;
            while (rst.next())
            {
                result = rst.getInt(1);
            }			
            return result;
        
    }

		
    public static void AddDBSite(Site site) {
        try{
            
            site.setNbRoom(getDBNbRoom(site));
            String query = "INSERT INTO Sites VALUES('"+site.getSiteName()+"','"+site.getAddress()+"')";
            insertDB(query);
        }catch(SQLException e){
        }		
    }
                
    public static DefaultComboBoxModel selectDBSite(DefaultComboBoxModel listSite) {
        try{
            String query = "SELECT SiteName FROM Sites";
            
            rst = selectDB(query);
            String result;
            while (rst.next())
            {
                result = rst.getString(1);
                listSite.addElement(result);
                System.out.println("selected site : "+result);
            }
            return listSite;
         }
         catch(SQLException e){
            return null;
        }
    }

    static boolean roomExist(String roomNum, String siteName) {
        try{
            
            String query = "SELECT COUNT(*) FROM Rooms WHERE SiteName='"+siteName+"'";
            rst = selectDB(query);
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
                String select = "SELECT COUNT(*) FROM Rooms WHERE NumRoom='"+roomNum+"'";
                rst = selectDB(select);
                int result2 =0;
                while (rst.next())
                {
                   result2 = rst.getInt(1);
                }
                System.out.println(result2);
                return result2 == 0;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
	}
    }

    public static DefaultComboBoxModel selectDBRoom(DefaultComboBoxModel listSite, String siteName) {
        try{
            String query = "SELECT NumRoom FROM Rooms WHERE SiteName='"+siteName+"'";
            
            rst = selectDB(query);
            String result;
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
    
    
    public static boolean checkID(String login, String pass) throws SQLException{
        String loginDB;
        String passDB;
        boolean check = false;
        String query = "SELECT * FROM Users ;";
        rst = selectDB(query);
        
        while (rst.next() && !(check))
            {
                loginDB = rst.getString(1);
                passDB = rst.getString(2);
                check = pass.equals(passDB) && login.equals(loginDB);
            }
        
        return check;
    }
    
    /*
    public static boolean supprNCDevRoom(int Room){
            String query = "DELETE FROM NetworkCards WHERE DevName = '"+Room+"' ";
            return insertDB(query);
            
    }
    */
    
    public static boolean supprNCDevName(String DevName){
            String query = "DELETE FROM NetworkCards WHERE DevName = '"+DevName+"'; ";
            return insertDB(query);
            
    }
    
    public static boolean supprNCInterCoDevName(String InterCoDevName){
            String query = "DELETE FROM NetworkCards WHERE IntercoDevName = '"+InterCoDevName+"'; ";
            return insertDB(query);
            
    }
    
    public static boolean supprNCMac(String MacAddr){
            String query = "DELETE FROM NetworkCards WHERE MacAddr = '"+MacAddr+"'; ";
            return insertDB(query);
            
    }
    
    public static boolean supprInterCoDevName(String Name){
            String query = "DELETE FROM IntercoDev WHERE InterCoDevName = '"+Name+"'; ";
            supprNCInterCoDevName(Name);
            return insertDB(query);
    }
    
    public static boolean supprInterCoDevRoom(int Room) {
            String query = "DELETE FROM IntercoDev WHERE NumRoom = '"+Room+"'; ";
            String select = "SELECT IntercoDevName FROM IntercoDev WHERE NumRoom = '"+Room+"'; " ;
            boolean check = insertDB(query);
            rst = selectDB(select);
             
        try {
            while(rst.next()){
                check = check && supprNCInterCoDevName(rst.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMana.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return check;
    }
    
    public static boolean supprInterCoDevSite(String Site) {
            String query = "DELETE FROM IntercoDev WHERE SiteName = '"+Site+"'; ";
            String select = "SELECT Room FROM Rooms WHERE SiteName = '"+Site+"'; " ;
            boolean check = true;
            rst = selectDB(select);
             
        try {
            while(rst.next()){
                check = check && supprInterCoDevRoom(rst.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMana.class.getName()).log(Level.SEVERE, null, ex);
        }
        check = check && insertDB(query);
            return check;
    }
    
    public static boolean supprDevName(String Name){
            String query = "DELETE FROM Devices WHERE DevName = '"+Name+"'; ";
            supprNCDevName(Name);
            return insertDB(query);
    }
    
    public static boolean supprDevRoom(int Room){
            String query = "DELETE FROM Devices WHERE NumRoom = '"+Room+"'; ";
            String select = "SELECT DevName FROM Devices WHERE NumRoom = '"+Room+"'; " ;
            boolean check = true;
            rst = selectDB(select);
             
        try {
            while(rst.next()){
                check = check && supprDevName(rst.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        check = check &&  insertDB(query);    
        
            return check;
    }
    
    public static boolean supprDevSite(String Site) {
            String query = "DELETE FROM Devices WHERE SiteName = '"+Site+"'; ";
            String select = "SELECT NumRoom FROM Rooms WHERE SiteName = '"+Site+"'; " ;
            boolean check = insertDB(query);
            rst = selectDB(select);
             
        try {
            while(rst.next()){
                check = check && supprDevRoom(rst.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMana.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return check;
    }
    
    public static boolean supprRoom(int Room){
        boolean check;
        check = supprDevRoom(Room) && supprInterCoDevRoom(Room);
        
        return check;
        
    }
    
    public static boolean supprSite(String Site){
        
        String query = "DELETE FROM Sites WHERE SiteName = '"+Site+"'; ";
        String select = "SELECT NumRoom FROM Rooms WHERE SiteName = '"+Site+"'; " ;
        boolean check = true ;
        rst = selectDB(select);
             
        try {
            while(rst.next()){
                check = check && supprRoom(rst.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMana.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        check = check && insertDB(query);
        
        return check;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
