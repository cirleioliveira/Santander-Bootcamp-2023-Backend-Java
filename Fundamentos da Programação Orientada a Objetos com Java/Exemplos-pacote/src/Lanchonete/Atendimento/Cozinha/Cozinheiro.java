package Lanchonete.Atendimento.Cozinha;

import Lanchonete.Atendimento.Atendente;

public class Cozinheiro {
    //pode ser default
    void adcionarLancheNoBalcao(){
        System.out.println("Adicionando lanche natural hamburger no balcao");;
    }
    //pode ser default
    void adicionarSucoNoBalcao(){
        System.out.println("Adicionando suco no balcao");
    }
    //pode ser default
    void adcionarComboNoBalcao(){
        adicionarSucoNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("Preparar lanche tipo hamburger");
    }
    private void prepararVitamina(){
        System.out.println("Preparando suco");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("Selecionado o pão, salada, ovo e carne");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("selecionado fruta, leite e suco");
    }
    private void lavarIngredientes(){
        System.out.println("Lavando ingredientes");
    }
    private void  baterVitaminaLiquidificador(){
        System.out.println("Batendo vitamina liquidificador");
    }
    private void fritarIngredientesLanche(){
        System.out.println("Fritando carne e ovo para hamburger");
    }
    /*public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }*/
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
