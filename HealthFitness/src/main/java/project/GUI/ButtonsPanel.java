/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.GUI;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author perfect solution
 */
public class ButtonsPanel extends JPanel {

    public ButtonsPanel() {
        setLayout(new java.awt.GridLayout(4, 4));
        for (int i = 0; i < 16; ++i) {
            JButton b = new JButton(String.valueOf(i));
            b.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    //...
                }
            });
            add(b);
        }
    }
}
