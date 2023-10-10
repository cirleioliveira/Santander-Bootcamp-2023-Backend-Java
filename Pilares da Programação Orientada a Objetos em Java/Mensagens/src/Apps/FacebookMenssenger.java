package Apps;
public class FacebookMenssenger extends ServicoMensagemInstantane {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("enviando mensagem pelo Facebook Menssenger");
        
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem pelo Facebook Menssenger");
        
    }
}
    
