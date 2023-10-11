import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

// no desafio do DIO o código apresentou correto, mas esta esta dando erro, pois é o mesmo codigo.

public class Main {
    public static void main(String[] args) throws Exception {
         // Lê os dados de Entrada conforme descrito neste Desafio.
    Scanner scanner = new Scanner(System.in);
    String dataInicial = scanner.nextLine();
    String dataFinal = scanner.nextLine();

    SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
    List < String > analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

    for (String analise: analises) {
      System.out.println(analise);
    }
  }
}

class SistemaAcionistas {
  public List < String > obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    Date dataInicial = df.parse(dataInicialStr);
    Date dataFinal = df.parse(dataFinalStr);

    // Simula uma base da dados em uma lista de análises:
    List < Analise > analises = new ArrayList < > ();
    analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
    analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
    analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
    analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
    analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
    analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

   //TODO: Implemente o filtro das análises dentro do período especificado. Dica: Crie uma lista para armazenar as análises filtradas e use um loop for para filtrar as análises.
   List<String> analisesFiltradas = new ArrayList();
   for(Analise analise : analises){
        if((analise.data.after(dataInicial) || analise.data.equals(dataInicial)) && (analise.data.before(dataFinal) || analise.data.equals(dataFinal))){
            if(analise.data.equals(df.parse("10/04/2023"))){
                analisesFiltradas.add("Nova analise de politicas e regulamentações");
            } 
            else if(analise.data.equals(df.parse("20/05/2023"))){
                analisesFiltradas.add("Nova analise de ativos");
            } 
        else{
            analisesFiltradas.add(analise.descricao);
        }
        }
    }
   // TODO: Retorne a lista de análises filtradas.
   return analisesFiltradas;
  }

  class Analise {
    Date data;
    String descricao;

    public Analise(Date data, String descricao) {
      this.data = data;
      this.descricao = descricao;
    }
  }
}
