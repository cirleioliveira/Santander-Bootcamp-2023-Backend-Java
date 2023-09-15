public class exemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Jonas", "Julis", "Marcos" };

        for (String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno); 
        }
        
        System.out.println("\n");
       for (int i=0; i<alunos.length; i++){
            System.out.println("O aluno no indice i = " + i + " é " + alunos[i]); 
       }
    }
    
}
