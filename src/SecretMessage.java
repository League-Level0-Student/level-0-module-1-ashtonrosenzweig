import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SecretMessage {
public static void main(String[] args) {
String pass = "password";
String attemptpass = JOptionPane.showInputDialog("What is the password?");
if (pass.equals(attemptpass)){
JOptionPane.showMessageDialog(null, "there was no message you just got kerpranked haha get rekt");
}else{
playAlarm();
}
}


public static void playAlarm() {
    System.out.println("ALARM!");
    try {
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(AudioSystem.getAudioInputStream(SecretMessage.class.getResource("alarm.wav")));
   		 clip.start();
   		 JOptionPane.showMessageDialog(null, "INTRUDER!");
   		 Thread.sleep(0);
   		 clip.stop();
   	} catch (Exception ex) {
     	ex.printStackTrace();
   	}
}
}
