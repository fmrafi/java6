/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HomePage.java
 *
 * Created on Oct 14, 2012, 1:13:38 PM
 */

package org.school.ui.student;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Rafiq
 */
public class HomePage extends javax.swing.JFrame {
        //Toolkit tk=Toolkit.getDefaultToolkit();
	//Dimension dim=tk.getScreenSize();
       private Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

    /** Creates new form HomePage */
    public HomePage() {
        initComponents();
          // setSize(dim.width,dim.height);
         //  setSize (getSize().width, getSize().height);
         //  setSize(d.width/2,d.height/2);
           setSize(550,600);
           setLocation(100,100);
          //setLocation (d.width / 2 - getWidth() / 2, d.height / 2 - getHeight() / 2);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItemStudent = new javax.swing.JMenuItem();
        ItemClass = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "class_ID", "Student ID", "Student Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(3).setResizable(false);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 110, 350, 270);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14));
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Search By ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 30, 90, 20);
        jPanel1.add(txtID);
        txtID.setBounds(109, 30, 120, 30);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton);
        searchButton.setBounds(240, 30, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 440, 400);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18));

        jMenu1.setText("Add");

        ItemStudent.setText("Student");
        ItemStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemStudentActionPerformed(evt);
            }
        });
        jMenu1.add(ItemStudent);

        ItemClass.setText("class");
        ItemClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemClassActionPerformed(evt);
            }
        });
        jMenu1.add(ItemClass);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Attendence");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Setting");

        jMenuItem3.setText("change PassWord");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Log Out");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("  Report");

        jMenuItem5.setText("Attendance Status");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
          
     
    }//GEN-LAST:event_searchButtonActionPerformed

    private void ItemStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemStudentActionPerformed
       
        new StudentDataForm().setVisible(true);
        
    }//GEN-LAST:event_ItemStudentActionPerformed

    private void ItemClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemClassActionPerformed
       new ClassDataForm_1().setVisible(true);
    }//GEN-LAST:event_ItemClassActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemClass;
    private javax.swing.JMenuItem ItemStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables

}
