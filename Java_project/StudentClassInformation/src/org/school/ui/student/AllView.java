

package org.school.ui.student;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.school.manager.DBJTable;

public class AllView extends javax.swing.JFrame {
private Vector<Vector<String>> data; //used for data from database
    private Vector<String> header; //used to store data header

    public AllView() throws Exception {
  DBJTable dbengine = new DBJTable();
        data = dbengine.getEmployee();

        //create header for the table
        header = new Vector<String>();
        header.add("ID");
        header.add("Name"); 
        header.add("Mobile No");
        header.add("Department"); 
        initComponents();
        setSize(500,600);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(

            data,header
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 82, 430, 330);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel1.setText("Student Infomation 2012");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 14, 280, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AllView().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AllView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
