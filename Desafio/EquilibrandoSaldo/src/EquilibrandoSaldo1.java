import java.util.Scanner;

public class EquilibrandoSaldo1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("valor atual");
        double saldoAtual = scanner.nextDouble();

        System.out.println("valor Deposito");
        double valorDeposito = scanner.nextDouble();

        System.out.println("valor retirada");
        double valorRetirada = scanner.nextDouble();

        saldoAtual += valorDeposito;
        double saldoAtualizado = saldoAtual - valorRetirada;

        System.out.printf("Saldo atualizado na conta: %.1f %n",  saldoAtualizado);

    }
}
