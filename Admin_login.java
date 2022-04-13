package Students;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
public class Admin_login extends javax.swing.JFrame {

    public Admin_login() {
        initComponents();
        getConnection();
    }
    
    public void getConnection() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
            Connection con;

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/result","root","RutuP@274");
            
                    Statement st = con.createStatement();
                    String query = "SELECT * FROM student_result";
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()) {
                    	String id = String.valueOf(rs.getInt("ID"));
                        String name = rs.getString("Name");
                        String mother = rs.getString("Mother");
                        String father = rs.getString("Father");
                        String state = rs.getString("State");
                        String gender = rs.getString("Gender");
                        String dOB = String.valueOf(rs.getInt("DOB"));
                        String category = rs.getString("Category");
                        String java = rs.getString("Java");
                        String dataStructure = rs.getString("DataStructure");
                        String networking = rs.getString("Networking");
                        
                       System.out.println(id+" "+name+" "+mother+" "+father+" "+state+" "+gender+" "+dOB+" "+category+" "+java+" "+dataStructure+" "+networking);
                        
                    }
    	} catch (Exception ex) {
    		ex.printStackTrace();
    	}
    	
    }
 private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        login = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        resetButton = new javax.swing.JButton();
        studentPanelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 8));

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 43)); 
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN LOGIN");

        jLabel2.setFont(new java.awt.Font("Constantia", 3, 22)); 
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Login ID");

        jLabel3.setFont(new java.awt.Font("Constantia", 3, 22)); 
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Password");

        enterButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); 
        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                enterButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); 
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitButtonActionPerformed(evt);
            }
        });

        pwd.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                pwdActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); 
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                resetButtonActionPerformed(evt);
            }
        });

        studentPanelButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); 
        studentPanelButton.setText("STUDENT PANEL");
        studentPanelButton.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                studentPanelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(studentPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    private JFrame frame;
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
        String log,pw;
        log=login.getText();
        pw=new String(pwd.getPassword());
        int i;
        for(i=0;i<3;i++){
            if(log.equals(Credentials.adminUserNames[i]) && pw.equals(Credentials.adminPassword[i])){
                new Admin_option().setVisible(true);
                this.setVisible(false);
                break;
            }
        }
        if(i==3){
            JOptionPane.showMessageDialog(frame, "Invalid user id or Password Please check");
        }
       
    }
    

    private void pwdActionPerformed(java.awt.event.ActionEvent evt) {
    	
        
    }
  

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
        frame =new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Conform if you want to exit or wait","Student Result System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }     
    }
    

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
        
        JTextField temp=null;
        JPasswordField t1=null;
        
        for(Component c:jPanel1.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                temp=(JTextField)c;
                temp.setText(null);
            }
        }
        for(Component c:jPanel1.getComponents()){
            if(c.getClass().toString().contains("javax.swing.JPasswordField")){
                t1=(JPasswordField)c;
                t1.setText(null);
            }
        }
    }
  

    private void studentPanelButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	
       
        new Student_login().setVisible(true);
        this.setVisible(false);
    }
    
     
    public static void main(String args[]) 
    {       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        // Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - 
    private javax.swing.JButton enterButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton studentPanelButton;
    // End of variables declaration
}
