package Lanchonete;

import Lanchonete.Area.Cliente.Cliente;
import Lanchonete.Atendimento.Atendente;
import Lanchonete.Atendimento.Cozinha.Almoxarife;
import Lanchonete.Atendimento.Cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
    //açoes que precisa estar disponiveis para toda a aplicação
      //  cozinheiro.lavarIngredientes();
        //cozinheiro.baterVitaminaLiquidificador();
        //cozinheiro.selecionarIngredientesVitamina();
        //cozinheiro.prepararLanche();
        //cozinheiro.prepararVitamina();
        //cozinheiro.prepararVitamina();

        //açoes que estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adcionarLancheNoBalcao();
        cozinheiro.adcionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que precisam estarem disponiveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.ControlarSaida();
       

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        /*//ação que somente o seu pacote cozinha precisa conhecer (default)
        atendente.trocarGas();*/

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento
        //ainda nao definiu normas de atendimento
        cliente.pegarPedidoBacao();

        //esta ação é muito sigilosa, que tal ser privada?
        cliente.consultarSaldoAplicativo();

        //Já pensou os clientes ouvindo que o gás acabou?
        //cozinheiro.pedirParaTrocarGas(atendente);
        //cozinheiro.pedirIngredientes(almoxarife);

    }
    //28 min
    
}
