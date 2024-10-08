import java.util.Scanner; 

public class Desafio { 

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite numero da conta: ");
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    
    System.out.println("Digite nome titula: ");
    String nomeTitular = scanner.nextLine();
    
    System.out.println("Digite o saldo: ");
    double saldo = scanner.nextDouble();

    //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
    ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular,saldo);

    System.out.println("Informacoes:");
    //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
    System.out.println("Conta: " + conta.numero);
    System.out.println("Titular: " + conta.titular);
    System.out.println("Saldo: R$ " + conta.saldo);
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
}
