/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.GUI;

import DAO.SleepDAO;
import java.time.Duration;
import javax.swing.JOptionPane;
import org.netbeans.swing.laf.dark.DarkMetalLookAndFeel;
import project.UserDetails.Sleep;
import project.UserDetails.User;

/**
 *
 * @author perfect solution
 */
public class Sleepfrm extends javax.swing.JFrame {

    User user;

    /**
     * Creates new form Sleepfrm
     */
    public Sleepfrm() {
        initComponents();

    }

    public Sleepfrm(User user) {
        initComponents();
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnSleepMode = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnMenuProfile = new javax.swing.JButton();
        btnMenuSleep = new javax.swing.JButton();
        btnMenuHome = new javax.swing.JButton();
        btnMenuExercise = new javax.swing.JButton();
        btnMenuNutrition = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(450, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setText("Sleep");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        btnSleepMode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSleepMode.setText("Sleep Mode");
        btnSleepMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSleepModeActionPerformed(evt);
            }
        });
        getContentPane().add(btnSleepMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 203, 112));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Check Sleep Cycle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 203, 126));

        btnMenuProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-male-user-24.png"))); // NOI18N
        btnMenuProfile.setPreferredSize(new java.awt.Dimension(100, 25));
        btnMenuProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProfileActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 90, 70));

        btnMenuSleep.setIcon(new javax.swing.ImageIcon("C:\\Users\\perfect solution\\Documents\\NetBeansProjects\\HealthFitness\\src\\main\\resources\\icons\\icons8-occupied-bed-24.png")); // NOI18N
        btnMenuSleep.setPreferredSize(new java.awt.Dimension(100, 25));
        btnMenuSleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuSleepActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuSleep, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 90, 80));

        btnMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-page-32.png"))); // NOI18N
        btnMenuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 90, 70));

        btnMenuExercise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-exercise-24.png"))); // NOI18N
        btnMenuExercise.setPreferredSize(new java.awt.Dimension(100, 25));
        btnMenuExercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuExerciseActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuExercise, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 90, 70));

        btnMenuNutrition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-vegetarian-food-24.png"))); // NOI18N
        btnMenuNutrition.setPreferredSize(new java.awt.Dimension(100, 25));
        btnMenuNutrition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuNutritionActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuNutrition, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 90, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sleep.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-460, -190, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSleepModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSleepModeActionPerformed
        // TODO add your handling code here:
        Sleep sleep = new Sleep();
        Duration timeElapsed = sleep.sleepMode();
        long hours = timeElapsed.toHours();
        long minutes = timeElapsed.toMinutes() % 60;
        String message = "You Slept for " + hours + " hours and " + minutes + " minutes";
        JOptionPane.showMessageDialog(this, message);
        SleepDAO.save(user, sleep);


    }//GEN-LAST:event_btnSleepModeActionPerformed

    private void btnMenuSleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuSleepActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnMenuSleepActionPerformed

    private void btnMenuExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuExerciseActionPerformed
        // TODO add your handling code here:
        new Workoutfrm(user).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMenuExerciseActionPerformed

    private void btnMenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuHomeActionPerformed
        // TODO add your handling code here:
        new Homefrm(user).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMenuHomeActionPerformed

    private void btnMenuNutritionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuNutritionActionPerformed
        // TODO add your handling code here:
        new NutritionMainfrm(user).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMenuNutritionActionPerformed

    private void btnMenuProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProfileActionPerformed
        // TODO add your handling code here:
        new Profilefrm(user).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMenuProfileActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (user.isPremium()) {
            new SleepCyclefrm(user).setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Only For Premium!");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            javax.swing.UIManager.setLookAndFeel(new DarkMetalLookAndFeel());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sleepfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sleepfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sleepfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sleepfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sleepfrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuExercise;
    private javax.swing.JButton btnMenuHome;
    private javax.swing.JButton btnMenuNutrition;
    private javax.swing.JButton btnMenuProfile;
    private javax.swing.JButton btnMenuSleep;
    private javax.swing.JButton btnSleepMode;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
