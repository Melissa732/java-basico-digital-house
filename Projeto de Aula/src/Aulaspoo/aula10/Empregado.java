package Aulaspoo.aula10;

public class Empregado extends Pessoa{

    private Double salario;
    private Double descontos;
    private String arquivo;

    public Empregado(String nome, Long cpf, Double salario, Double descontos) {
        super(nome, cpf);
        this.salario = salario;
        this.descontos = descontos;
    }

    //SOBRECARGA - AQUI MUDA A QUANTIDADE DE PARAMETROS QUE COLOCAMOS NO METODO
    public Double calcularSalario (Double valorHora){
        return 220*valorHora;
    }
    //sobrecarga
    public Double calcularSalario (Double valorHora, Double quantidadeHoras){
        return valorHora *quantidadeHoras;
    }

    //SOBREESCRITO MODIFICANDO CODIGO
    @Override // tiene que ser el mismo método que está en pessoa, igual nome, parámetros e etc.
    public void calcularImc(int valorImc){
        //se usa-se private no Nome da classe Pessoa pegaria com getNome()
        // quando é protected, se puede usar la variable mismo
        // quando é privated, se tiene que usar get ou setting
        System.out.println(nome+ ". CPF: " + getCpf()+ " seu IMC é: " + valorImc + ". Preste atenção nos valores consultando a tabela de  Google");
    }


    //GET AND SETTING
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getDescontos() {
        return descontos;
    }

    public void setDescontos(Double descontos) {
        this.descontos = descontos;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
