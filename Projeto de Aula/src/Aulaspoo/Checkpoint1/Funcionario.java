package Aulaspoo.Checkpoint1;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private String funcao;

    public Funcionario(String nome, String sobrenome, String funcao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.funcao = funcao;
    }

    //Métodos e Relacionamento
    public String cadastrarAtividade(Atividade atividade) {
        return (" O Funcionário " + getNome() + getSobrenome() + " vai exercer hoje a atividade de " + atividade);
    }

    //GETS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
