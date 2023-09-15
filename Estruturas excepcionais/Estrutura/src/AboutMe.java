import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo: " + nome.toLowerCase() + sobrenome.toUpperCase(null));
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm");
        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade, altura precisa ser numericos ");
        }
        
         /*     
            try: A instrução permite que voce define um bloco de código para ser testado quando a erros enquanto esta sendo executado.

            catch: A instrução permite definir um bloco de código a ser executado, caso ocorra um erro no broco try.

            finally: A instrção permiti definir um bloco de código a ser executado independente de ocorrer um erro ou não. as palavras-chave try e catch.
         */ 
    }
    
}
