package Aulaspoo.Checkpoint1;

public class Atividade {

    private String titulo;
    private String setor;
    private String data;
    private Boolean status;
    private String descricao;

    public Atividade(String titulo, String setor, String data, Boolean status, String descricao) {
        this.titulo = titulo;
        this.setor = setor;
        this.data = data;
        this.status = status;
        this.descricao = descricao;
    }

    //Métodos e Relacionamento
    private Setor[] nome;
    public boolean atividadeFinalizada(){
        if (status.equals("Finalizada")) {
            return true;
        }
        System.out.println("Iniciada");
        return false;
    }

    //GET AND SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
