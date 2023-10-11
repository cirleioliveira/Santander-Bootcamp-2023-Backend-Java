import java.util.Scanner;

public class CofreSeguro {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tipo de cofre: Digital ou Fisico");
        String tipoCofre = scanner.nextLine();
        
        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            System.out.println("Digite a senha");
            int senha = scanner.nextInt();
            System.out.println("Digite a senha novamente");
            int confirmacaoSenha = scanner.nextInt();

            CofreDigital cofreDigital = new CofreDigital(senha);
            if(cofreDigital.validarSenha(confirmacaoSenha)){
                cofreDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            }else{
                cofreDigital.imprimirInformacoes();
                System.out.println("Senha incorreta!");
            }
        }
        else if(tipoCofre.equalsIgnoreCase("fisico")){
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
        else
            System.out.println("Tipo de cofre invalido");
    }
}


abstract class Cofre{
    protected String tipo;
    protected String metodoAbertura;
    
    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}