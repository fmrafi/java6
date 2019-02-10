

package org.school.ui.student;

import javax.swing.JOptionPane;
import org.school.util.DBConnection;


public class StudentLogin extends javax.swing.JFrame {

    /** Creates new form StudentLogin */
    private  int passwordCount=0;
    public StudentLogin() {
        super("Student Login");
        initComponents();
        setSize(400,300);
        setLocation(100, 100);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Student ID :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 50, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Student Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 90, 110, 30);
        jPanel1.add(txtID);
        txtID.setBounds(119, 50, 140, 30);

        BackButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/school/ui/Student/Back.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(10, 170, 110, 30);

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton);
        loginButton.setBounds(140, 170, 80, 30);

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton);
        cancelButton.setBounds(230, 170, 80, 30);
        jPanel1.add(txtName);
        txtName.setBounds(120, 90, 140, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 360, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       String id=txtID.getText();
       String name=txtName.getText();
        String sql="select *from t_student where sID='"+ id +"' and StName='"+ name +"' ";
              try{
                   boolean status=DBConnection.checkValue(sql);

                       if (status) {
			  this.hide();
			  
                          ViewStudentinfo vStudent=new ViewStudentinfo();
                         vStudent.setVisible(true);

			  } else {
			  passwordCount++;
			  JOptionPane.showMessageDialog(null,
			  "Invalid!!!\nUsername or password incorrect.");

                         //  clear();

                           }


                   if (passwordCount == 3) {

                       System.exit(0);

                   }
              }

              catch (Exception ev)
              {

                  ev.printStackTrace();
              }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
          System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
         new MainWindow().setVisible(true);
         this.hide();
    }//GEN-LAST:event_BackButtonActionPerformed
/**/
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
