import javax.sound.midi.Soundbank;

import Apps.FacebookMenssenger;
import Apps.MSNMenssenger;
import Apps.Telegran;

public class ComputadorDoPedrinho {
    public static void main(String[] args) {
        // Abrindo MSN  Menssenger 
        System.out.println("msn");
        MSNMenssenger msn = new MSNMenssenger();        
        msn.enviarMensagem();
        msn.receberMensagem();

         System.out.println("Facebook");
        FacebookMenssenger fc = new FacebookMenssenger();        
        fc.enviarMensagem();
        fc.receberMensagem();

         System.out.println("Telegran");
        Telegran tlg = new Telegran();        
        tlg.enviarMensagem();
        tlg.receberMensagem();

     }
}
