public class ServicoMensagemInstantane {
    public void enviarMensagem(){
        //primeiro confirma se esta conectado a internet
        validarConectadoInternet();
        System.out.println("enviando mensagem");
        //Depois de enviada, salvar o historico da mensagem
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    //metodo pivadas, visiveis somente na classe
    private void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando o historico da mensagem");
    }
    
}
