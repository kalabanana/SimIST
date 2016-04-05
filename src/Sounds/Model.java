/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sounds;

import java.io.FileInputStream;
import java.io.IOException;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.*;

/**
 *
 * @author Qiu
 */
public class Model {
    
    public void music(){
      AudioPlayer Play = AudioPlayer.player;
      AudioStream click;
      AudioData Data;
      
      try{
      click = new AudioStream(new FileInputStream ("src\\music\\button.wav"));
      Data = click.getData();
      }
      catch(IOException Error){
      System.out.print("music not found. ");
      }
    

}
}
