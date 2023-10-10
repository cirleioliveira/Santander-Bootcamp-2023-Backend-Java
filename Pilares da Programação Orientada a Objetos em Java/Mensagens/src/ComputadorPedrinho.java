import javax.sound.midi.Soundbank;
//polimorfismo

import Apps.FacebookMenssenger;
import Apps.MSNMenssenger;
import Apps.ServicoMensagemInstantane;
import Apps.Telegran;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantane smi = null;
        /*
         * Não se sabe qual app
         * mas qualquer um deverá enviar  e recever mensagem
         */

        String appEscolhido="msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNMenssenger();
        else if(appEscolhido.equals("fc"))
            smi = new FacebookMenssenger();
        else if(appEscolhido.equals("tgl"))
            smi = new Telegran();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
