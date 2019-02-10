package org.school.ui.student;
import javax.swing.JOptionPane;
import org.school.util.DBConnection;


public class AdminLogin extends javax.swing.JFrame {

     private  int passwordCount=0;
    public AdminLogin() {
        super("admin login");
        initComponents();
        setSize(350,280);
        setLocation(100,100);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPassord = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("User Name      :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(18, 31, 110, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("User Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 70, 120, 30);
        jPanel1.add(txtName);
        txtName.setBounds(130, 30, 150, 30);
        jPanel1.add(txtPassord);
        txtPassord.setBounds(130, 70, 150, 30);

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn);
        loginBtn.setBounds(130, 190, 80, 30);

        cancelBtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn);
        cancelBtn.setBounds(220, 190, 80, 30);

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/school/ui/Student/Back.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(10, 190, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 310, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String adname=txtName.getText();
       String adpassword=txtPassord.getText();

       String sql="select *from t_admin where adName='"+ adname +"' and adPassword='"+ adpassword +"' ";
              try{
                   boolean status=DBConnection.checkValue(sql);

                       if (status) {
			  this.hide();
			  HomePage homepage=new HomePage();
                          homepage.setVisible(true);

			  } else {
			  passwordCount++;
			  JOptionPane.showMessageDialog(null,
			  "Invalid!!!\nUsername or password incorrect.");
					
                           clear();

                           }

				
                   if (passwordCount == 3) {

                       System.exit(0);
				
                   }
              }

              catch (Exception ev)
              {

                  ev.printStackTrace();
              }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed

        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
       this.hide();
       new MainWindow().setVisible(true);

    }//GEN-LAST:event_BackButtonActionPerformed
private void clear(){
    txtName.setText("");
  txtPassord.setText("");
}
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassord;
    // End of variables declaration//GEN-END:variables

}
