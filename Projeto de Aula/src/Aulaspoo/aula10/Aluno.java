package Aulaspoo.aula10;

//SUBCLASSE OU CLASSE FILHA

//Quando quero aplicar Herança usamos extends
public class Aluno extends Pessoa{
    private Double nota;

    public Aluno(String nome, Long cpf, Double nota) {
        super(nome, cpf); //cria o construtor exatamente como o da Superclase/Classe pai
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}

