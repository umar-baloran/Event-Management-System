/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newproject;

import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author admin
 */
public class alarm {
    
    
public void  play()
{
    try
    {
        InputStream in=new FileInputStream("C:\\Users\\LambdaWorks\\Desktop\\USB\\New folder\\jEventManagement\\jEventManagement\\jEventManagement\\newproject\\newproject\\newproject\\src\\images\\alarm_beep.wav");
        AudioStream as=new AudioStream(in);
        AudioPlayer.player.start(in);
        
    
    }
    catch(Exception ex){
    
    System.out.println(ex);
    }
}   
    
}
