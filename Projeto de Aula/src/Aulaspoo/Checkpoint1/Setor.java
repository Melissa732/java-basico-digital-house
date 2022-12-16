package Aulaspoo.Checkpoint1;

public class Setor {

    private String nome;
    private String gestor;

    public Setor(String nome, String gestor) {
        this.nome = nome;
        this.gestor = gestor;
    }

    //Métodos
    public void tituloAtividade (Atividade titulo){
        System.out.println("Está no setor " + nome);
    }

    //Get and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGestor() {
        return gestor;
    }

    public void setGestor(String gestor) {
        this.gestor = gestor;
    }
}
