public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // método CONSTRUTOR
    //o nome devera ser igual ao nome da classe
    public Pessoa(String cpf, String nome){
        this.nome  = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
   
    public String getCpf() {
        return cpf;
    }
   
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
