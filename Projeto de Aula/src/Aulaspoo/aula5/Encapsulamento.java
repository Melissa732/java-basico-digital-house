package Aulaspoo.aula5;

public class Encapsulamento {

    /* Encapsulamento: colocar em cápsulas, PROTEGER o conteúdo interno.
       Em POO evit que qualquer outro objeto tenha acceso à estructura
       interna de um objeto.

       Objetivo: ocultação da informação e ocultacao da implementacao.
       Sem encapsulamento qualquer programa pode acessar um conjunto de dados. O acceso de dados
       de uma entidade (classe) deve ser restrito e é o dev que tem controle quais programas podem acessar quais
       informacoes através dos modificadores de acesso.

       Por exemplo: o objeto Pessoa cujo atributo é a chave de acesso do banco, nao sería conveniente que todos os
       objetos pudessem acessar livremente esse atributo. O objeto Pessoa deve estabelecer um método
       controlado e seguro para retornar a chave de acesso do banco, por exemplo, se as medidas de segurança forem
       atendidas.

       Modificadores de acesso: private, public, protected, static
       */

    private String nome;
    private Integer cpf;
    private Boolean isMaiorIdade;
    private boolean isMaiorIdade1;
    private Double salario;

    //Estático (static): é possível acessar em outra classe sem criar um objeto (new)
    //é um atributo que será o mesmo em todos os lugares onde é acessado, puede ser usado en atributos y métodos
    private static String corOlhos = "Azul";

    /*Getters and Setters*/

    //Atalho para get e set: alt insert, escolher getter e setters ou Botão direito dentro da classe - GENERATE - GETTER AND SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Boolean getMaiorIdade() {
        return isMaiorIdade;
    }

    public void setMaiorIdade(Boolean maiorIdade) {
        isMaiorIdade = maiorIdade;
    }

    public boolean isMaiorIdade1() {
        return isMaiorIdade1;
    }

    public void setMaiorIdade1(boolean maiorIdade1) {
        isMaiorIdade1 = maiorIdade1;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static String getCorOlhos() {
        return corOlhos;
    }

    public static void setCorOlhos(String corOlhos) {
        Encapsulamento.corOlhos = corOlhos;
    }
}
