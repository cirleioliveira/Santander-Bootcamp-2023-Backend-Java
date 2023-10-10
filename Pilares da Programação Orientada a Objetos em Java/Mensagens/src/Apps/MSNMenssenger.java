package Apps;
public class MSNMenssenger extends ServicoMensagemInstantane{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN Menssenger");

    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem pelo MSN Menssenger");
        
    }
    
}
