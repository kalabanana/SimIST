/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sounds;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Qiu
 */
public class View implements KeyListener{
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JLabel label2;
    private Controller control;

    public View(){
        frame = new JFrame("Sample");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(150,150);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        label = new JLabel("CLICK the Button!");
        frame.getContentPane().add(label,BorderLayout.NORTH);
        label2 = new JLabel("PRESS the Arrow-keys!");
        frame.getContentPane().add(label2,BorderLayout.CENTER);
        button = new JButton ("Click");
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        
        frame.addKeyListener(this);
    }        
    
    public JButton getButton(){
        return button;
    }
    
    public void keyTyped(KeyEvent ke) {
        
    }
    
    public void keyPressed(KeyEvent ke) {
        control.keylisten.keyPressed(ke);
    }

    public void keyReleased(KeyEvent ke) {
        control.keylisten.keyReleased(ke);
    }
}
