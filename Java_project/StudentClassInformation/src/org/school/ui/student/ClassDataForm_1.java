

package org.school.ui.student;



import java.util.Calendar;

import javax.swing.JOptionPane;
import org.school.domain.clazz_1;
import org.school.manager.classManager_1;
import org.school.util.DateUtil_1;
//import sun.util.calendar.BaseCalendar.Date;


public class ClassDataForm_1 extends javax.swing.JFrame {
  //  private Process runtimeProcess;

    /** Creates new form ClassDataForm_1 */
    public ClassDataForm_1() {
        initComponents();
        setSize(500,400);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtClassNo = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        btnBackup = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("Class Entry Data Form 2012");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 20, 230, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setForeground(new java.awt.Color(255, 0, 153));
        jLabel2.setText("Class No     :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 90, 80, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("Class Date   :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 140, 80, 30);
        jPanel1.add(txtClassNo);
        txtClassNo.setBounds(130, 90, 200, 30);

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SaveButton);
        SaveButton.setBounds(9, 240, 100, 30);

        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ResetButton);
        ResetButton.setBounds(129, 240, 110, 30);

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton);
        ExitButton.setBounds(260, 240, 90, 30);

        btnBackup.setText("Backup");
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });
        jPanel1.add(btnBackup);
        btnBackup.setBounds(360, 240, 90, 30);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(130, 140, 210, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        String id = txtClassNo.getText();
        Calendar cal = jDateChooser1.getCalendar();        
        String dtString = DateUtil_1.getDateAsString(cal.getTime());
        //System.out.println(dtString);        
        clazz_1  sc = new clazz_1(id, dtString);
        boolean isSave = classManager_1. isSaveClassWithPrepared_1(sc);
        if(isSave)
        {
            //System.out.println("Succssfully Save class Data");
            JOptionPane.showMessageDialog(rootPane, "Succssfully Save class Data");
           // clear();
        }
        else{
           JOptionPane.showMessageDialog(rootPane, "Sorry Insertion Failed !");
            }
         
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
       dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
   

    
  

    

}//GEN-LAST:event_btnBackupActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassDataForm_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton btnBackup;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtClassNo;
    // End of variables declaration//GEN-END:variables

}
