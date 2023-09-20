package Lanchonete.Atendimento;

public class Atendente { 
    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("Servindo mesa");
    }
    private void pegarLancheCozinha(){   
        System.out.println("Pegando lanche na cozinha");
    }
    public void receberPagamento(){
        System.out.println("recebendo pagamento");
    }
    void trocarGas(){
        System.out.println("Atendente trocando gás");
    }
    private void pegarPedidoBacao(){
        System.out.println("Pegando o pedido no balcao");
    }
}
