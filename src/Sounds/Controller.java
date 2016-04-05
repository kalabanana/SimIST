/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sounds;
import sun.audio.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Qiu
 */
public class Controller {
    private Model model;
    private View view;
    private ActionListener actionListener;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    public void control(){
        actionListener = new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                onClick();
            }
        };
    }
    private void onClick(){
        music();
    }
    public static void music(){
      AudioPlayer Play = AudioPlayer.player;
      AudioStream BGM;
      AudioData Data;
      ContinuousAudioDataStream loop = null;
      
      try{
      BGM = new AudioStream(new FileInputStream ("lady_gaga-bad_romance.mid"));
      Data = BGM.getData();
      loop = new ContinuousAudioDataStream(Data);
      }
    catch(IOException Error){
    System.out.print("music not found");
    }
    
    Play.start(loop);

}
}

