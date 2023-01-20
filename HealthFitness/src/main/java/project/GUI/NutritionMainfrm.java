/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project.GUI;

import javax.swing.JOptionPane;
import project.UserDetails.User;

/**
 *
 * @author Sohail Kazmi
 */
public class NutritionMainfrm extends javax.swing.JFrame {
    private User user;
    /**
     * Creates new form NutritionMainfrm
     */
    public NutritionMainfrm(User user) {
        initComponents();
        this.user = user;
    }
    
    public NutritionMainfrm() {
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

        addbtn = new javax.swing.JButton();
        checkbtn = new javax.swing.JButton();
        btnMenuNutrition = new javax.swing.JButton();
        btnMenuExercise = new javax.swing.JButton();
        btnMenuHome = new javax.swing.JButton();
        btnMenuSleep = new javax.swing.JButton();
        btnMenuProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(450, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addbtn.setText("ADD Calorie Intake");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 330, 90));

        checkbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkbtn.setText("Consumption Data");
        checkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbtnActionPerformed(evt);
            }
        });
        getContentPane().add(checkbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 330, 90));

        btnMenuNutrition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-vegetarian-food-24.png"))); // NOI18N
        btnMenuNutrition.setPreferredSize(new java.awt.Dimension(100, 25));
        btnMenuNutrition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuNutritionActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuNutrition, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 90, 80));

        btnMenuExercise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-exercise-24.png"))); // NOI18N
        btnMenuExercise.setPreferredSize(new java.awt.Dimension(100, 25));
        btnMenuExercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuExerciseActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuExercise, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 90, 70));

        btnMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-home-page-32.png"))); // NOI18N
        btnMenuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 90, 70));

        btnMenuSleep.setIcon(new javax.swing.ImageIcon("C:\\Users\\perfect solution\\Documents\\NetBeansProjects\\HealthFitness\\src\\main\\resources\\icons\\icons8-occupied-bed-24.png")); // NOI18N
        btnMenuSleep.setPreferredSize(new java.awt.Dimension(100, 25));
        btnMenuSleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuSleepActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuSleep, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 90, 70));

        btnMenuProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-male-user-24.png"))); // NOI18N
        btnMenuProfile.setPreferredSize(new java.awt.Dimension(100, 25));
        btnMenuProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProfileActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 90, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel1.setText("Nutrition");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/GUI/Nutrition.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Nutritionfrm(user).setVisible(true);
    }//GEN-LAST:event_addbtnActionPerformed

    private void checkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbtnActionPerformed
        // TODO add your handling code here:
        if(user.isPremium())
        {
            this.dispose();
            new NutritionCheckfrm(user).setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Only For Premium!");
        }
    }//GEN-LAST:event_checkbtnActionPerformed

    private void btnMenuNutritionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuNutritionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnMenuNutritionActionPerformed

    private void btnMenuExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuExerciseActionPerformed
        // TODO add your handling code here:
        new Workoutfrm(user).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMenuExerciseActionPerformed

    private void btnMenuSleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuSleepActionPerformed
        // TODO add your handling code here:
        new Sleepfrm(user).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMenuSleepActionPerformed

    private void btnMenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuHomeActionPerformed
        // TODO add your handling code here:
        new Homefrm(user).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMenuHomeActionPerformed

    private void btnMenuProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProfileActionPerformed
        // TODO add your handling code here:
        new Profilefrm(user).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMenuProfileActionPerformed

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
            java.util.logging.Logger.getLogger(NutritionMainfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NutritionMainfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NutritionMainfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NutritionMainfrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutritionMainfrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton btnMenuExercise;
    private javax.swing.JButton btnMenuHome;
    private javax.swing.JButton btnMenuNutrition;
    private javax.swing.JButton btnMenuProfile;
    private javax.swing.JButton btnMenuSleep;
    private javax.swing.JButton checkbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
