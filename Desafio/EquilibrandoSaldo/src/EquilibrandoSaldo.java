import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("valor atual");
        double saldoAtual = scanner.nextDouble();

        System.out.println("valor Deposito");
        double valorDeposito = scanner.nextDouble();

        System.out.println("valor Valor retirada");
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
       saldoAtual = depositar(saldoAtual, valorDeposito);
       saldoAtual = saque(saldoAtual, valorRetirada);
       
     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println("Saldo atual: R$ " + saldoAtual);
    }

    static double depositar(double saldoAtual, double valorDeposito){
        saldoAtual = saldoAtual + valorDeposito;
        return saldoAtual;
    }

    static double saque(double saldoAtual, double valorRetirada){
        saldoAtual = saldoAtual - valorRetirada;
        return saldoAtual;
    }
}
