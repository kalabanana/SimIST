/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sounds;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Qiu
 */
public class View {
    private JFrame frame;
    private JButton button;
    private JLabel label;
    
    public View(String text){
        frame = new JFrame("Sample");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(150,150);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        label = new JLabel("CLICK the Button!");
        frame.getContentPane().add(label,BorderLayout.CENTER);
        button = new JButton ("Click");
        frame.getContentPane().add(button, BorderLayout.SOUTH);
    }
    public JButton getButton(){
        return button;
    }
}
