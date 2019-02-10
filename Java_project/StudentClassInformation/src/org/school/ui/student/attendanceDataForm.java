
package org.school.ui.student;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.school.domain.Student;
import org.school.domain.clazz_1;
import org.school.manager.StudentManager;
import org.school.manager.classManager_1;






public class attendanceDataForm extends javax.swing.JFrame {

       List<Student> studentList = null;
    List<clazz_1> classList = null;


    public attendanceDataForm() {
       initComponents();
        studentList = StudentManager.getStudents();
        attendenceTable.setModel(createTable(getTableData(studentList),getTableHeader()));
        classList = classManager_1.getClasses();
        //cmbClassDate.setModel(new javax.swing.DefaultComboBoxModel(getClassesDate()));
        setSize(500,500);
    }


   private String [] getTableHeader(){
        String [] s = {"Student ID", "Student Name", "Status"};
        return s;
    }

    private Object[][] getTableData(List<Student> studentList){
        if(studentList == null || studentList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[studentList.size()][3];
        for(int i=0; i<studentList.size();i++)
        {
            Student student = studentList.get(i);
            obj[i][0] = student.getsID();
            obj[i][1] = student.getStudentName();
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class};
            boolean[] canEdit = new boolean [] {
                false, false, true
            };
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        savButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendenceTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Attendance Sheet");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(72, 17, 230, 30);

        savButton.setText("Save");
        savButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savButtonActionPerformed(evt);
            }
        });
        getContentPane().add(savButton);
        savButton.setBounds(220, 310, 57, 23);

        attendenceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(attendenceTable);
        attendenceTable.getColumnModel().getColumn(0).setResizable(false);
        attendenceTable.getColumnModel().getColumn(2).setResizable(false);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 120, 330, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savButtonActionPerformed
      

    }//GEN-LAST:event_savButtonActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendanceDataForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable attendenceTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton savButton;
    // End of variables declaration//GEN-END:variables

}
