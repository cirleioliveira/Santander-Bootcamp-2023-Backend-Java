package Apps;
public abstract class ServicoMensagemInstantane {
    public abstract void enviarMensagem();
    public abstract void receberMensagem(); 
    //Abstração nao tem corpo

    //polimosfirmos
    //somente os filhos conhecem este método
    protected void validarConectadoInternet(){
        System.out.println("Validando se esta conectado a internet");
    }
    
}
