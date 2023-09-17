import java.util.ArrayList;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);
        ArrayList <String> ativos = new ArrayList<>();

        //Entrada dos tipos de ativos
        System.out.println("Quantidades de ativos");
        int quantidadeAtivos = banco.nextInt();
        banco.nextLine();

        // Entrada dos códigos dos ativos
        for(int i=0; i < quantidadeAtivos; i++){
            System.out.println("Ativo");
            String codigoAtivo = banco.nextLine();
            ativos.add(codigoAtivo);
            ativos.sort(null);
        }
        //TODO: Ordenar os ativos em ordem alfabética.
        System.out.println("Ativos ordenados:");
        for(String ativo : ativos){
            System.out.println(ativo);

        //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        }

    }
}
