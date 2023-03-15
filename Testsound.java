import javax.sound.midi.*;
import javax.sound.midi.spi.*;

public class Testsound {

    public void play()
    {
        try {
            Sequencer player = new MidiSystem.getSequencer();
            player.open();
        }
        finally{
            play();

        }

    }
    
    
    public static void main(String args[])
    {
     Testsound music = new Testsound();
     music.play();
        
    }
    
}
