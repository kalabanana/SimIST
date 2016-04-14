/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.swing.Timer;
import models.CharacterMovement;
import models.Customer;
import views.Room206;
import views.TestFrame;

/**
 *
 * @author qpm5006
 */
public class RoomController {
    private Room206 room206;
    private Timer gameTimer;
    public RoomController() throws Exception
    {
        
        TestFrame testFrame = new TestFrame();
        Customer student = new Customer();
        CharacterMovement charMovement = new CharacterMovement(student);
        room206 = new Room206(student, charMovement);
        charMovement.setRoom206(room206.getShelf(), room206.getShorttable(),room206.getLongtable(),room206.getMiddletable(),room206.getCornertable(),room206.getWallUD(),room206.getWallLR());
        testFrame.add(room206);
        testFrame.setSize(530,670);
        
        gameTimer = new Timer(5,new GameTimer());
        gameTimer.start();
        InputStream is;
        Sequencer sequence;
        sequence = MidiSystem.getSequencer();
        sequence.open();
        is = new BufferedInputStream(new FileInputStream(new File("beatit.mid")));
        sequence.setSequence(is);
        sequence.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        sequence.start();
        is.close();

    }
    
    class GameTimer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            
             room206.repaint();
                
            }
        }
    
}
    

