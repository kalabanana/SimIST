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
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author Qiu
 */
public class Model {
    
    public void music(){
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
