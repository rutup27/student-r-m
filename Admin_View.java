package Students;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class Admin_View extends javax.swing.JFrame {
    
    public Admin_View() {
        initComponents();
        showDetails();
    }
    public void showDetails() {
        DefaultTableModel model = (DefaultTableModel)table.getModel();    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;

            con=DriverManager.getConnection("JDBC:mysql://localhost:3306/result","root","RutuP@274");
            Statement stmt;

            stmt=con.createStatement();
            stmt.executeUpdate("use resultsystem;");
            String sql;
            

           ResultSet rs;
            

            sql="select * from result;";

            rs=stmt.executeQuery(sql);
            while(rs.next()){
                String id=rs.getString("id");
                String name=rs.getString("name");
                String mother=rs.getString("mother");
                String father=rs.getString("father");
                String gender =rs.getString("gender");
                String cat=rs.getString("category");
                String state=rs.getString("state");
                String dob=rs.getString("dob");
                String Java=rs.getString("Java");
                String DataStructrure=rs.getString("DataStructrure");
                String Networking=rs.getString("Networking");
                String total=rs.getString("total");
                
              model.addRow(new Object[]{id,name,mother,father,state,gender,dob,cat,Java,DataStructrure,Networking,total});
            }
            
            
            rs.close();
    
            con.close();
            stmt.close();
           
        }
        catch(Exception e)
        {

        }
        table.setModel(model);
    }
   
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mother", "Father", "State", "Gender", "DOB", "Category", "Java", "DataStructrure", "Networking", "Total"
            }
        ));
        jScrollPane1.setViewportView(table);

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(backButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new Admin_option().setVisible(true);
        this.setVisible(false);
    }

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_View().setVisible(true);
            }
        });
    }

    // Variables declaration -
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    
}
