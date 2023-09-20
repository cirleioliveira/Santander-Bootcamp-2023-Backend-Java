package Lanchonete.Area.Cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("Escolhendo o lanche");
    }
    public void fazerPedido(){
        System.out.println("Fazendo pedido");
    }
    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Pagando a conta");
    }
    private void consultarSaldoAplicativo(){
        System.out.println("Consultando o saldo no aplicativo");
    }
    /*public void pegarPedidoBacao(){
        System.out.println("pegando o pedido no bancao");
    }*/
    
}
