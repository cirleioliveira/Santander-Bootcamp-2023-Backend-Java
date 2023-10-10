package Apps;
public class Telegran extends ServicoMensagemInstantane {
    
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegran");

    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem pelo Telegran");
        
    }
}
    
