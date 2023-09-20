package Lanchonete.Atendimento.Cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando a entrada dos itens");
    }
    private void ControlarSaida(){
        System.out.println("Controlando saida dos itens");
    }
    void entregarIngredientes(){
        System.out.println("Entregando ingredientes");
        ControlarSaida();
    }
    void trocarGas(){
        System.out.println("Almoxarife trocando o gás");
    }
}