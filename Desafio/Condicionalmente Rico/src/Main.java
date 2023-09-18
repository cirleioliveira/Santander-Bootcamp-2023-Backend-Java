import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do saldo: ");
        int saldoTotal = scanner.nextInt();

        System.out.println("Informe o valor saque: ");
        int valorSaque= scanner.nextInt();
        
        int saldoDisponivel = total(saldoTotal, valorSaque);

        if(saldoTotal > valorSaque){
            System.out.println("saldo atual " + saldoDisponivel);
        }else{
            System.out.println("Saldo insuficiente. Saque não realizado!");
        }
    }

    static int total(int saldoTotal, int valorSaque){
        int saldoDisponivel = saldoTotal - valorSaque;
        return saldoDisponivel;

    }

}
