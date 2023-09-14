import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args) {
        Scanner dados = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Agência: ");
        int numAgencia = dados.nextInt();

        System.out.println("Digite o número da Conta: ");
        String conta = dados.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = dados.next();

        System.out.println("Informe o Saldo: ");
        Double saldo = dados.nextDouble();

        System.out.println(
            "\nOlá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, " +
            "\nSua agência é " + numAgencia + 
            "\nConta " + conta + 
            "\nSaldo " + saldo + 
            "\nSaldo já está disponível para saque\n"
        );
    }
}
