
package atm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Edit extends javax.swing.JFrame {
    Connection con = null;
    String acNO,img2;
    ResultSet rs,rsc;

    public Edit() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog2 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        acname = new java.awt.TextField();
        acno = new java.awt.TextField();
        cuname = new java.awt.TextField();
        initial = new java.awt.TextField();
        add = new java.awt.TextField();
        code = new java.awt.TextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        img = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jSearchButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editing:atm");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30));
        jLabel2.setText("Account No:*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 30));
        jLabel4.setText("Account Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 30));
        jLabel5.setText("Customer Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 30));
        jLabel6.setText("Initial Balance/Refil:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 30));
        jLabel8.setText("Present Address:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 30));
        jLabel12.setText("Security Code:*");

        acname.setFont(new java.awt.Font("Dialog", 0, 25));
        acname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acnameActionPerformed(evt);
            }
        });

        acno.setFont(new java.awt.Font("Dialog", 0, 25));
        acno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acnoMouseExited(evt);
            }
        });
        acno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acnoActionPerformed(evt);
            }
        });

        cuname.setFont(new java.awt.Font("Dialog", 0, 25));

        initial.setEnabled(false);
        initial.setFont(new java.awt.Font("Dialog", 0, 25));

        add.setFont(new java.awt.Font("Dialog", 0, 25));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        code.setFont(new java.awt.Font("Dialog", 0, 25));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/cancel.png"))); // NOI18N
        jButton2.setText("Cancle");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30));
        jLabel3.setText("Image:*");

        jPanel1.setBackground(new java.awt.Color(106, 114, 7));

        jLabel1.setFont(new java.awt.Font("Sony Sketch EF", 1, 52));
        jLabel1.setForeground(new java.awt.Color(239, 248, 243));
        jLabel1.setText("Edit an ATM Account");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1)
                .addContainerGap(365, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        img.setEditable(false);
        img.setFont(new java.awt.Font("Tahoma", 0, 12));
        img.setToolTipText("");
        img.setName("Image size must be 200:300"); // NOI18N
        img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton4.setForeground(new java.awt.Color(255, 5, 7));
        jButton4.setText("Reset");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 0, 36));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/Copy of Duch Bangla Bank Ltd DBBL Logo.png"))); // NOI18N
        update.setText("Update");
        update.setFocusable(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jSearchButton.setFont(new java.awt.Font("Tahoma", 0, 36));
        jSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/info.png"))); // NOI18N
        jSearchButton.setText("Search");
        jSearchButton.setFocusPainted(false);
        jSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchButtonActionPerformed(evt);
            }
        });

        jLabel7.setAutoscrolls(true);

        jMenu1.setText("Opening");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Searching");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Cancle");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jSearchButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(acno, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                            .addComponent(initial, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                            .addComponent(cuname, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                            .addComponent(code, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(acname, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))))
                        .addGap(465, 465, 465))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {acname, acno, add, code, cuname, initial});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel12, jLabel2, jLabel4, jLabel5, jLabel6, jLabel8});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(initial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(update)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel12, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel8});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {acname, acno, add, code, cuname, initial});

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void acnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acnameActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_acnameActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new refile().setVisible(rootPaneCheckingEnabled);
this.hide();// TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new Edit().setVisible(true);
this.hide();
}//GEN-LAST:event_jButton4ActionPerformed

private void acnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acnoActionPerformed
jSearchButtonActionPerformed(evt);    
}//GEN-LAST:event_acnoActionPerformed

private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_addActionPerformed

private void acnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acnoMouseExited

}//GEN-LAST:event_acnoMouseExited

private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
new admin().setVisible(true);
this.hide();
}//GEN-LAST:event_jMenu4MouseClicked

private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
new Search().setVisible(true);
this.hide();
}//GEN-LAST:event_jMenu2MouseClicked

private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
new account_opening().setVisible(true);
this.hide();
}//GEN-LAST:event_jMenu1MouseClicked

private void imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_imgActionPerformed

private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
Jdbc jdbc=new Jdbc();
jdbc.connection();

    if(acNO==null)
    {
    String aname2=acname.getText();
    String accnum=acno.getText();
    String custname2=cuname.getText();
    String addr2=add.getText();
    String co2=code.getText();
    img2=img.getText();
    
    jdbc.createTable("UPDATE customer SET account_name='"+aname2+"',customer_name='"+custname2+"',address='"+addr2+"',code='"+co2+",image='"+img2+"' WHERE account_no='"+accnum+"'");
    String searc="SELECT *from customer where account_no='"+accnum+"'";
    rs=(ResultSet)jdbc.find_statement(searc);
        try {
            while(rs.next())
            {
                JOptionPane.showMessageDialog(null,"if Account no: "+rs.getString(2)+"\nis successfuly up-to-date..");
                new Edit().setVisible(true);
                this.hide();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    else{
        String aname1=acname.getText();
        String custname1=cuname.getText();
        String addr1=add.getText();
        String co1=code.getText();
        jdbc.createTable("UPDATE customer SET account_name='"+aname1+"',customer_name='"+custname1+"',address='"+addr1+"',code='"+co1+"' WHERE account_no='"+acNO+"'");
        String searc="SELECT *from customer where account_no='"+acNO+"'";
        rs=(ResultSet)jdbc.find_statement(searc);
        try {
            while(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Account no: "+rs.getString(2)+"\nis successfuly up-to-date..");
                new Edit().setVisible(true);
                this.hide();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Edit.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
jdbc.connectionclose();
}//GEN-LAST:event_updateActionPerformed

private void jSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchButtonActionPerformed
Jdbc jdbc=new Jdbc();
jdbc.connection();
    String image;
    String an,cn,i,pa,cod,ad,get;
    String chk=null;
    acNO=acno.getText();
    String accnum = null;
   
    /*******************Check account number*************************/
    String search="select * from customer where account_no='"+acNO+"'";
    rs= (ResultSet) jdbc.find_statement(search);
        try {
            while(rs.next())
            {
                    try {
                        accnum=rs.getString(2);
                    } catch (SQLException ex) {
                        Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /******************if Account number Exists Then perform*******************/
    String sear="select * from customer where account_no='"+acNO+"'";
    rs= (ResultSet) jdbc.find_statement(sear);
        
 
    if( "".equals(accnum))
       {
       JOptionPane.showMessageDialog(rootPane,"Account field empty");
       }
    else if (acNO.equals(accnum)){
        try {
            while(rs.next())
            {System.out.println(acNO);
                
                
                acname.setText(rs.getString(1));
                cuname.setText(rs.getString(3));
                initial.setText(rs.getString(4));
                add.setText(rs.getString(5));
                code.setText(rs.getString(6));
                img.setText(rs.getString(7));
            
                ImageIcon shain=new  ImageIcon(rs.getString(7));
                jLabel7.setIcon(shain);
                //JLabel sh1=new JLabel();
                jLabel7.setBounds(660,60,470,530);
                /*add(sh1);
                JButton sh=new JButton();
                sh.setBounds(660,60,470,530);
                sh.setIcon(shain);
                add(sh);
                initComponents();*/
                }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        else
                {
                JOptionPane.showMessageDialog(rootPane,"Acccount no: "+acno.getText()+"\nis not avilable!");
                }
    jdbc.connectionclose();
}//GEN-LAST:event_jSearchButtonActionPerformed


    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField acname;
    private java.awt.TextField acno;
    private java.awt.TextField add;
    private java.awt.TextField code;
    private java.awt.TextField cuname;
    private javax.swing.JTextField img;
    private java.awt.TextField initial;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton jSearchButton;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
