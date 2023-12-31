/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Main;

/**
 *
 * @author hp
 */
public class TeachersDashboard extends javax.swing.JFrame {

    /**
     * Creates new form TeachersDashboard
     */
    public TeachersDashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnForgot = new javax.swing.JButton();
        btncancel1 = new javax.swing.JButton();
        btnadd1 = new javax.swing.JButton();
        btnadd2 = new javax.swing.JButton();
        btnadd3 = new javax.swing.JButton();
        btnadd4 = new javax.swing.JButton();
        btnadd5 = new javax.swing.JButton();
        btnadd6 = new javax.swing.JButton();
        btnadd7 = new javax.swing.JButton();
        btnadd8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Teacher's Dashboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        btnadd.setBackground(new java.awt.Color(0, 102, 102));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Class Management");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnForgot.setBackground(new java.awt.Color(204, 204, 204));
        btnForgot.setText("Logout");
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });

        btncancel1.setBackground(new java.awt.Color(0, 51, 51));
        btncancel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncancel1.setForeground(new java.awt.Color(255, 255, 255));
        btncancel1.setText("Cancel");
        btncancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancel1ActionPerformed(evt);
            }
        });

        btnadd1.setBackground(new java.awt.Color(0, 102, 102));
        btnadd1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd1.setForeground(new java.awt.Color(255, 255, 255));
        btnadd1.setText("Add Attendance");
        btnadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd1ActionPerformed(evt);
            }
        });

        btnadd2.setBackground(new java.awt.Color(0, 102, 102));
        btnadd2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd2.setForeground(new java.awt.Color(255, 255, 255));
        btnadd2.setText("Assignment and Homework");
        btnadd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd2ActionPerformed(evt);
            }
        });

        btnadd3.setBackground(new java.awt.Color(0, 102, 102));
        btnadd3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd3.setForeground(new java.awt.Color(255, 255, 255));
        btnadd3.setText("Add new Student");
        btnadd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd3ActionPerformed(evt);
            }
        });

        btnadd4.setBackground(new java.awt.Color(0, 102, 102));
        btnadd4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd4.setForeground(new java.awt.Color(255, 255, 255));
        btnadd4.setText("Resources and Materials");
        btnadd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd4ActionPerformed(evt);
            }
        });

        btnadd5.setBackground(new java.awt.Color(0, 102, 102));
        btnadd5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd5.setForeground(new java.awt.Color(255, 255, 255));
        btnadd5.setText("Reports and Analysis");
        btnadd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd5ActionPerformed(evt);
            }
        });

        btnadd6.setBackground(new java.awt.Color(0, 102, 102));
        btnadd6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd6.setForeground(new java.awt.Color(255, 255, 255));
        btnadd6.setText("Setting and Profile");
        btnadd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd6ActionPerformed(evt);
            }
        });

        btnadd7.setBackground(new java.awt.Color(0, 102, 102));
        btnadd7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd7.setForeground(new java.awt.Color(255, 255, 255));
        btnadd7.setText("Communication");
        btnadd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd7ActionPerformed(evt);
            }
        });

        btnadd8.setBackground(new java.awt.Color(0, 102, 102));
        btnadd8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd8.setForeground(new java.awt.Color(255, 255, 255));
        btnadd8.setText("Student Information");
        btnadd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnadd4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadd3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnForgot, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnadd7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnadd5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnadd2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncancel1)
                .addGap(503, 503, 503))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnadd1)
                    .addComponent(btnadd2))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd7)
                    .addComponent(btnadd8)
                    .addComponent(btnadd3))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd4)
                    .addComponent(btnadd6)
                    .addComponent(btnadd5))
                .addGap(109, 109, 109)
                .addComponent(btncancel1)
                .addGap(46, 46, 46)
                .addComponent(btnForgot)
                .addGap(0, 176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(603, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
         classmanagement tech = new classmanagement();
                   this.hide();
                   tech.show();
                   
    }//GEN-LAST:event_btnaddActionPerformed

    private void btncancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancel1ActionPerformed

    private void btnadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd1ActionPerformed
      attedndancestd tech = new attedndancestd();
                   this.hide();
                   tech.show();  
    }//GEN-LAST:event_btnadd1ActionPerformed

    private void btnadd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadd2ActionPerformed

    private void btnadd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd3ActionPerformed
frmAddNewStd tech = new frmAddNewStd();
                   this.hide();
                   tech.show();          // TODO add your handling code here:
    }//GEN-LAST:event_btnadd3ActionPerformed

    private void btnadd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadd4ActionPerformed

    private void btnadd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadd5ActionPerformed

    private void btnadd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadd6ActionPerformed

    private void btnadd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadd7ActionPerformed

    private void btnadd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnadd8ActionPerformed

    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
frmTeacher tech = new frmTeacher();
                   this.hide();
                   tech.show();        
    }//GEN-LAST:event_btnForgotActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TeachersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeachersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeachersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeachersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachersDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgot;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnadd1;
    private javax.swing.JButton btnadd2;
    private javax.swing.JButton btnadd3;
    private javax.swing.JButton btnadd4;
    private javax.swing.JButton btnadd5;
    private javax.swing.JButton btnadd6;
    private javax.swing.JButton btnadd7;
    private javax.swing.JButton btnadd8;
    private javax.swing.JButton btncancel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
