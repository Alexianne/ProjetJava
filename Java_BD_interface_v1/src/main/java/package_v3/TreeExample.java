package package_v3;
 
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
 
public class TreeExample extends JFrame
{
    
      
    private final JTree tree;
    public TreeExample()
    {
        int nbrooms;
        int i, j;
        
        
        String Site = "TBS";
        //La racine = Site 
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(Site);
        
        //Premier fils = Rooms 
  
        ArrayList<Integer> Rooms = new ArrayList<>(); 
        Rooms = DBMana.getDBArrayNumRoom(Site);
        
              
        //Second Fils IntercoDev
        
        ArrayList<String> NameIntercoDev = new ArrayList<>();
        
        
        
        for ( i=0; i<Rooms.size(); i++ ){
            
            DefaultMutableTreeNode RoomsNode = new DefaultMutableTreeNode(Rooms.get(i));
            root.add(RoomsNode);
            NameIntercoDev = DBMana.getDBArrayIntercoDev(Rooms.get(i));
            
            for ( j=0; j<NameIntercoDev.size(); j++ ){
                
               DefaultMutableTreeNode IntercoDevNode = new DefaultMutableTreeNode(NameIntercoDev.get(j));
               RoomsNode.add(IntercoDevNode);
               
            }
            
            
            
        }
        
        
        
 
        //add the child nodes to the root node
        
         
        
        
        
        
        
        
        //create the tree by passing in the root node
        tree = new JTree(root);
        add(tree);
         
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example");  
        this.setSize(800, 600);
        //this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new TreeExample();
                
            }
        });
    }        
}