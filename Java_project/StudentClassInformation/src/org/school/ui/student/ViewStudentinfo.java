
package org.school.ui.student;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.school.manager.DBJTable;


public class ViewStudentinfo extends javax.swing.JFrame {

    
    private Vector<Vector<String>> data;
    private Vector<Vector<String>> data1;
    private Vector<String> header;
    public ViewStudentinfo() {
        initComponents();
        setSize(460,500);
         jTable1.getTableHeader().setReorderingAllowed(false);
         jTable1.getTableHeader().setResizingAllowed(false);
    }

  public void  getData1()
    {
    try {
        DBJTable  a = new DBJTable();
        data1 = a. getEmployee();
        //create header for the table
        header = new Vector<String>();
         header.add("Student ID"); 
        header.add("Student Name"); 
        header.add("Mobile No");
        header.add("Dept. Name");
     

        } catch (Exception ex) {
             ex.printStackTrace();
          
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setText("Student ID ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 80, 20);

        searchButton.setText("search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton);
        searchButton.setBounds(260, 20, 80, 30);
        jPanel1.add(txtID);
        txtID.setBounds(100, 20, 150, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,header
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 380, 260);

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(360, 20, 70, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 430, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
         if(evt.getSource()==searchButton)
        {
            String one=txtID.getText();
             if(one.equals(""))
                {
                JOptionPane.showMessageDialog(rootPane,"please fill student id");
                }
            }
        try {

            String query = "select * from t_student where sID ="+Integer.parseInt(txtID.getText());
           
             JOptionPane.showMessageDialog(rootPane, "Succssfully search");
            getData1();
            jTable1.setModel(new javax.swing.table.DefaultTableModel(data1,header));

        } catch (Exception ex) {
          
        ex.printStackTrace();

        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
       this.hide();
        StudentLogin Student=new StudentLogin();
          Student.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewStudentinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

}
