/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * patient.java
 *
 * Created on Jun 7, 2010, 9:53:59 PM
 */

/**
 *
 * @author Md.Farhad.Ali
 */
import java.io.*;
 import java.sql.*;
import javax.swing.UIManager;
import javax.swing.*;
public class patient_1 extends javax.swing.JFrame {
ResultSet rs;
           Statement sta;


    public static String a,a1,p1,p,p2,p3,a2,a3,a4,a5,a6,a7,a8,a9,p4,p5,p6,p7,p8,p9,p10,a10;
    
    /** Creates new form patient */
    public patient_1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("jLabel2");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Arial Black", 3, 18));
        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel3.setForeground(new java.awt.Color(255, 0, 153));
        jLabel3.setText("ID NO:");

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel4.setForeground(new java.awt.Color(153, 102, 255));
        jLabel4.setText("FRIST NAME:");

        jComboBox1.setForeground(new java.awt.Color(51, 102, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ONE", "MALE ", "FEMALE" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("ADDRESS:");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel6.setForeground(new java.awt.Color(204, 102, 0));
        jLabel6.setText("VILLAGE:");

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("DEPARTMENT:");

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("JOINING DATE:");

        jComboBox2.setForeground(new java.awt.Color(204, 51, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ONE", "EMERGENCY", "SERGERY", "ORTHOPADIC", "MEDECINE", "GYNE", "EYE WARD", "PEDRIADIC" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("SEX:");

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel12.setForeground(new java.awt.Color(153, 0, 255));
        jLabel12.setText("LAST NAME:");

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("AGE:");

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel15.setForeground(new java.awt.Color(0, 204, 153));
        jLabel15.setText("HOUSE NO:");

        jLabel16.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel16.setForeground(new java.awt.Color(102, 0, 102));
        jLabel16.setText("DISTRICT:");

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel18.setForeground(new java.awt.Color(0, 204, 204));
        jLabel18.setText("CONTACT NO:");

        jButton3.setBackground(new java.awt.Color(153, 255, 204));
        jButton3.setFont(new java.awt.Font("Arial Black", 3, 36));
        jButton3.setForeground(new java.awt.Color(153, 0, 255));
        jButton3.setText("EMPLOYEE'S INFORMATION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Arial Black", 3, 18));
        jButton4.setForeground(new java.awt.Color(204, 102, 255));
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Arial Black", 3, 18));
        jButton5.setForeground(new java.awt.Color(204, 102, 0));
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("FATHER'S NAME:");

        jButton2.setFont(new java.awt.Font("Monotype Corsiva", 3, 36));
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel19.setForeground(new java.awt.Color(204, 0, 51));
        jLabel19.setText("JOB CLASS:");

        jComboBox3.setForeground(new java.awt.Color(153, 51, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ANY ONE", "FIRST CLASS", "SECOND CLASS", "THIRD CLASS", "FOURTH CLASS" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jButton3)
                .addContainerGap(1111, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(166, 166, 166)
                            .addComponent(jTextField14))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(217, 217, 217)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addGap(106, 106, 106)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField4)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9))
                            .addGap(119, 119, 119)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 173, Short.MAX_VALUE)
                                .addComponent(jTextField9)
                                .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox3, 0, 173, Short.MAX_VALUE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(340, 340, 340))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(696, 696, 696))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(468, 468, 468)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1338, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   Jdbc j=new Jdbc();
      j.connection();
        p1="";
       p2="";

      p3="";
       p4="";
       p5="";
       p6="";
        p7="";
       p8="";
        p9="";
       p10="";
       String id1=jTextField1.getText();
      //if(p3.equals(id1))
      //{
      //JOptionPane.showMessageDialog(null,"FIRST  SELECT  AN  ID  OF  A  PATIENT, AND  OTHER  INFORMATION  THEN  SAVE .......  ","BAD NEWS",JOptionPane.WARNING_MESSAGE);
     // }
     // else

 a1 = new String(jTextField1.getText());
 a2=new String(jTextField2.getText());
 a3=new String(jTextField4.getText());
 a4=new String(jTextField14.getText());
  a5=new String(jTextField9.getText());
  a6=new String(jTextField11.getText());
  a7=new String(jTextField6.getText());
  a8=new String(jTextField10.getText());
  a9=new String(jTextField5.getText());
   //a10=new String(jTextField12.getText());
String ahmed=" ";
 boolean b;
 if(a1.equals(p1)|| a2.equals(p2)|| a3.equals(p3)|| a4.equals(p4)|| a5.equals(p5)|| a6.equals(p6)|| a7.equals(p7)|| a8.equals(p8)|| a9.equals(p9))
 {
  if(a1.equals(p1))
  JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR  ID........ ","warning",JOptionPane.WARNING_MESSAGE);
 if(a2.equals(p2))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   NAME  ........ ","warning",JOptionPane.WARNING_MESSAGE);
if(a3.equals(p3))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   FATHER'S  NAME  ........ ","warning",JOptionPane.WARNING_MESSAGE);
if(a4.equals(p4))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   ADDRESS  ........ ","warning",JOptionPane.WARNING_MESSAGE);
if(a5.equals(p5))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   VILLAGE NAME  ........ ","warning",JOptionPane.WARNING_MESSAGE);
  if(a6.equals(p6))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   JOINING  DATE  ........ ","warning",JOptionPane.WARNING_MESSAGE);
if(a7.equals(p7))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   AGE ........ ","warning",JOptionPane.WARNING_MESSAGE);
  if(a8.equals(p8))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   DISTRICT  NAME  ........ ","warning",JOptionPane.WARNING_MESSAGE);
if(a9.equals(p9))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   MOBILE  NUMBER  OR  PHONE  NUMBER ........ ","warning",JOptionPane.WARNING_MESSAGE);
////if(a10.equals(p10))
//JOptionPane.showMessageDialog(null,"PLEASE  GIVE  THE CABIN  NUMBER  THAT  YOU  ADMITTED  IN ........ ","warning",JOptionPane.WARNING_MESSAGE);



 }

else
{

   String u="98888";
 String a = new String(jTextField1.getText());
   //String a1 = new String(jTextField1.getText());
   //String p=new String(jPasswordField1.getPassword());
    String search="select * from employee where id='"+a+"'";
	rs=j. find_statement(search);
  try{
    while(rs.next())
    {
  //u1=rs.getString(1);
  u=rs.getString(1);
  //pass=rs.getString(4);
    }
    }catch(Exception e){}
if(u.equals(a))
{
JOptionPane.showMessageDialog(null,"THIS ID  ALREADY   CONTAINS    AN  EMPLOYEE .  SO  CHANGE  THE ID  THEN SAVE.....THANKS   .......  ","BAD NEWS",JOptionPane.WARNING_MESSAGE);
 String s="select * from employee where id='"+a+"'";

       rs=j.find_statement(s);
 id1="";
String id2="     ID    NAME    \n\n";
String id3="--------|---------\n\n";
         try{
    while(rs.next())
    {

for(int i=1;i<=2;++i)
{String id=rs.getString(i);
id1=id1+"    "+id;
}
id1=id1+"\n";


    }
    id1=id2+id3+id1+"\n"+"THIS  ID YOU ENTERED ARE ALREADY USED!!!";
            JOptionPane.showMessageDialog(null,id1);
       j.result_stat.close();
	 j.st_stat.close();

   }catch(Exception e){}


}
else
{


     String  id=jTextField1.getText();
    String hous=jTextField8.getText();
    String mbl=jTextField5.getText();
    String age=jTextField6.getText();
    String dstr=jTextField10.getText();
 
    String join=jTextField11.getText();
    String name=jTextField2.getText();
     String lme=jTextField7.getText();
    String vill=jTextField9.getText();
       String adr=jTextField14.getText();
       String fnm=jTextField4.getText();
       
    Object dept=jComboBox2.getSelectedItem();
      Object sex=jComboBox1.getSelectedItem();
      Object job=jComboBox3.getSelectedItem();


    try{

         
      j.createTable("create table employee(id int,name varchar(20),last_name varchar(20),fathers_name varchar(40),sex varchar(10), address varchar(50),village varchar(50),department varchar(30),joining_date varchar(30),age varchar(20),house varchar(20),district varchar(20),contract_no varchar(20),resigned_status varchar(20),resigned_date varchar(20),job_class varchar(20),primary key (id))");
     
     j.createTable("insert into employee values ('"+id+"','"+name+"','"+lme+"','"+fnm+"','"+sex+"','"+adr+"','"+vill+"','"+dept+"','"+join+"','"+age+"','"+hous+"','"+dstr+"','"+mbl+"','no','not resigned','"+job+"')");
     JOptionPane.showMessageDialog(null,"Entry succesful......");
     }catch(Exception e)
    {
         System.out.println(" Found some error : " +e);

     }}
}
     // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
main n=new main();
this.hide();
n.show();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
jTextField1.setText(" ");
    jTextField2.setText(" ");
    jTextField8.setText(" ");
    jTextField6.setText(" ");
    jTextField10.setText(" ");
    
    jTextField11.setText(" ");
    jTextField5.setText(" ");
jTextField7.setText(" ");
    jTextField4.setText(" ");

  // jComboBox1.setText(" ");
     jTextField14.setText(" ");
      jTextField9.setText(" ");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
serch_2 s=new serch_2();
this.hide();
s.show();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed



    @Override
    public void hide() {
        super.hide();
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}