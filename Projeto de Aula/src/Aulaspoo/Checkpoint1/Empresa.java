package Aulaspoo.Checkpoint1;

public class Empresa {

    private String nome;
    private Long cnpj;
    private List

    public Empresa(String nome, Long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    //Métodos e Relacionamento

    public void cadastrarFuncionario(Funcionario funcionario) {
        System.out.println(" A empresa " + getNome() + " com o " + getCnpj() + " têm 150 funcionários ");
    }

    //GET AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
}
