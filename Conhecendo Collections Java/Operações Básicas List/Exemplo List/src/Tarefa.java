public class Tarefa {
    //atributos
    private String descricao;
    
    public Tarefa(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
