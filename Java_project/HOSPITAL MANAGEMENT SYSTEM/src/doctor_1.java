/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * doctor.java
 *
 * Created on Jun 7, 2010, 11:43:02 PM
 */

/**
 *
 * @author Md.Farhad.Ali
 */
import java.io.*;
 import java.sql.*;
import javax.swing.UIManager;
import javax.swing.*;
public class doctor_1 extends javax.swing.JFrame {
ResultSet rs;
           Statement sta;
    public static String u,a,a1,p1,p,p2,p3,a2,a3,a4,a5,a6,a7,a8,a9,p4,p5,p6,p7,p8,p9,p10,a10,p11;
    /** Creates new form doctor */
    public doctor_1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36));
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("OUTDOOR DOCTOR'S PANEL");

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel2.setForeground(new java.awt.Color(204, 0, 102));
        jLabel2.setText("DOCTOR'S NAME:");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("FATHER'S NAME:");

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel4.setForeground(new java.awt.Color(204, 153, 0));
        jLabel4.setText("SEX:");

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel5.setForeground(new java.awt.Color(255, 102, 255));
        jLabel5.setText("ADDRESS:");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("VILLAGE/CITY:");

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel7.setForeground(new java.awt.Color(0, 204, 0));
        jLabel7.setText("SPECIAL SKILLS:");

        jComboBox1.setForeground(new java.awt.Color(153, 0, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ANY ONE", "MALE", "FEMALE" }));

        jComboBox2.setForeground(new java.awt.Color(255, 0, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ANY ONE", "CYCHOLOGY", "ORTHOPADIC", "MEDICINE", "NOSE,EAR & TONGUE", "EYE WARD", "PEDRRADIC", "WOMAN & GAINOLOGY", "SKIN & SEX" }));

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel9.setForeground(new java.awt.Color(153, 0, 255));
        jLabel9.setText("ATTRIBUTION:");

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("ID-NO:");

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel11.setForeground(new java.awt.Color(51, 0, 204));
        jLabel11.setText("AGE:");

        jLabel12.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("HOUSE:");

        jLabel13.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("DISTRICT:");

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("DUTY PERIOD:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ANY ONE", "MBBS", "FCPS", "MBBS & FCPS", "OTHERS MORE" }));

        jComboBox4.setForeground(new java.awt.Color(153, 102, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ANY ONE", "8.00AM-11.00AM", "11.00AM-2.00PM", "3.00PM-6.00PM", "6.00PM-9.00PM" }));

        jButton1.setFont(new java.awt.Font("Arial Black", 3, 18));
        jButton1.setForeground(new java.awt.Color(255, 0, 255));
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 3, 18));
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 18));
        jButton5.setForeground(new java.awt.Color(153, 204, 0));
        jButton5.setText("SEARCH BY NAME");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 18));
        jButton6.setForeground(new java.awt.Color(255, 153, 51));
        jButton6.setText("SEARCH");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Monotype Corsiva", 3, 24));
        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("DOCTOR'S IN DUTY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel15.setForeground(new java.awt.Color(0, 102, 153));
        jLabel15.setText("DUTY DATE:");

        jComboBox5.setForeground(new java.awt.Color(153, 0, 255));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ANY ONE", "SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THUSDAY", "FRIDAY" }));

        jLabel16.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel16.setForeground(new java.awt.Color(255, 0, 255));
        jLabel16.setText("PERMANENT JOB PLACE:");

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("HOSPITAL NAME:");

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel18.setForeground(new java.awt.Color(255, 102, 51));
        jLabel18.setText("EXPERIENCE:");

        jComboBox6.setForeground(new java.awt.Color(255, 51, 51));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT ANY ONE", "1 YEAR", "2 YEARS", "3 YEARS", "4 YEARS", "5 YEARS", "6 YEARS", "MORE" }));

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel8.setForeground(new java.awt.Color(255, 0, 255));
        jLabel8.setText("SALARY:");

        jLabel19.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel19.setForeground(new java.awt.Color(153, 153, 0));
        jLabel19.setText("MOBILE NAME:");

        jLabel20.setFont(new java.awt.Font("Monotype Corsiva", 3, 18));
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("JOINING DATE:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel19))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel13)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel20))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, 0, 202, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField9)
                                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField6)
                                        .addComponent(jTextField5)
                                        .addComponent(jTextField4)
                                        .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(jComboBox3, 0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1)))
                .addGap(202, 202, 202))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 626, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
            .addGroup(layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(688, 688, 688))
            .addGroup(layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(jButton5)
                .addGap(35, 35, 35)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20)
                            .addGap(9, 9, 9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
main dd=new main();
this.hide();
dd.show();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Jdbc j=new Jdbc();
      j.connection();
 String u="";
    String pass="";
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
        p11="";
 a1 = new String(jTextField1.getText());
 a2=new String(jTextField2.getText());
 a3=new String(jTextField3.getText());
 a4=new String(jTextField4.getText());
  a5=new String(jTextField5.getText());
  a6=new String(jTextField6.getText());
  a7=new String(jTextField7.getText());
  a8=new String(jTextField8.getText());
  a9=new String(jTextField9.getText());
  a10=new String(jTextField10.getText());
   
      String  dnm=jTextField1.getText();
    String fnm=jTextField2.getText();
    String id=jTextField3.getText();
    String age=jTextField4.getText();
    String hose=jTextField5.getText();
 String vill=jTextField7.getText();
    String dist=jTextField6.getText();
  String hname=jTextField9.getText();
    String salary=jTextField10.getText();
  String mbl=jTextField11.getText();
String jdate=jTextField12.getText();

  Object sex=jComboBox1.getSelectedItem();
     Object spc=jComboBox2.getSelectedItem();
     Object attr=jComboBox3.getSelectedItem();
      Object duty=jComboBox4.getSelectedItem();
       Object ddate=jComboBox5.getSelectedItem();
        Object exp=jComboBox6.getSelectedItem();

       if(a1.equals(p1)|| a2.equals(p2)|| a3.equals(p3)|| a4.equals(p4)|| a5.equals(p5)|| a6.equals(p6)|| a7.equals(p7)|| a8.equals(p8)||a9.equals(p9)||a10.equals(p10))
 {
  if(a1.equals(p1))
  JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR  NAME........ ","warning",JOptionPane.WARNING_MESSAGE);
 if(a2.equals(p2))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   FATHER'S  NAME  ........ ","warning",JOptionPane.WARNING_MESSAGE);
if(a3.equals(p3))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   ID  ........ ","warning",JOptionPane.WARNING_MESSAGE);
if(a4.equals(p4))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   AGE  ........ ","warning",JOptionPane.WARNING_MESSAGE);
if(a5.equals(p5))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   HOUSE  NO  ........ ","warning",JOptionPane.WARNING_MESSAGE);
  if(a6.equals(p6))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   DISTRICT  NAME ........ ","warning",JOptionPane.WARNING_MESSAGE);
if(a7.equals(p7))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   VILLAGE ........ ","warning",JOptionPane.WARNING_MESSAGE);
  if(a8.equals(p8))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   ATTRIBUTION ........ ","warning",JOptionPane.WARNING_MESSAGE);
 if(a9.equals(p9))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   HOSPITAL  NAME........ ","warning",JOptionPane.WARNING_MESSAGE);
 if(a10.equals(p10))
JOptionPane.showMessageDialog(null,"PLEASE  GIVE  YOUR   HOSPITAL  NAME........ ","warning",JOptionPane.WARNING_MESSAGE);

 }

else
{
   String u1="1234";
 String a = new String(jTextField3.getText());
   //String a1 = new String(jTextField1.getText());
   //String p=new String(jPasswordField1.getPassword());
    String search="select * from doctor_1 where id='"+a+"'";
	rs=j. find_statement(search);
  try{
    while(rs.next())
    {
  //u1=rs.getString(1);
  u1=rs.getString(1);
  //pass=rs.getString(4);
    }
    }catch(Exception e){}
if(u1.equals(a))
{
JOptionPane.showMessageDialog(null,"THIS ID  ALREADY   CONTAINS    A   PATIENT .  SO  CHANGE  THE ID  THEN SAVE.....THANKS   .......  ","BAD NEWS",JOptionPane.WARNING_MESSAGE);

	   String s="select * from doctor_1 where id='"+a+"'";

       rs=j.find_statement(s);
 String id1="";
String id2="     ID    NAME    \n\n";
String id3="--------|---------\n\n";
         try{
    while(rs.next())
    {

for(int i=1;i<=2;++i)
{String id5=rs.getString(i);
id1=id1+"    "+id5;
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


      try{
       j.createTable("create table doctor_1(id varchar(20),name varchar(20),father_name varchar(20),age varchar(20),house varchar(20), district varchar(20),sex varchar(20),village varchar(20),special_skills varchar(20),attribution varchar(20),duty_time varchar(20),duty_date varchar(20),experience varchar(20),hospital_name varchar(50),salary varchar(20),mobile_no varchar(20),joining_date varchar(20),resigned_date varchar(20),resigned_status varchar(20),primary key (id))");

     j.createTable("insert into doctor_1 values ('"+id+"','"+dnm+"','"+fnm+"','"+age+"','"+hose+"','"+dist+"','"+sex+"','"+vill+"','"+spc+"','"+attr+"','"+duty+"','"+ddate+"','"+exp+"','"+hname+"','"+salary+"','"+mbl+"','"+jdate+"','not resigned','no')");

     JOptionPane.showMessageDialog(null,"Entry succesful......");
     }catch(Exception e)
     {
         System.out.println(" Found some error : " +e);

     }}}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
name_1 sc=new name_1();
this.hide();
sc.show();// TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       serch_4 sc=new serch_4();
this.hide();
sc.show();
        
        //setVisible(false);
        //new serch_1().setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
name_4 n=new name_4();
this.hide();
n.show();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
