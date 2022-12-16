package Aulaspoo.aula4;

/*Modificadores de Acceso: Public, Private e Protected
/* Uma classe é um modelo ou molde ABSTRATO onde são programados um conjunto de objetos
com caracteristicas afins, que possuem atributos (caracteristicas) e mé todos
(comportamentos) comuns.*/
/* cada classe tem caracteristicas comuns ou atributos e
açoes ou métodos ou funçōes. */
// UMA CLASSE TEM : ATRIBUTO + CONSTRUCTOR + METODOS

import java.time.LocalDate;

public class Pessoa {

    /* FALANDO DE ATRIBUTOS: características distintas de um objeto.
    Estrutura: modificador de acesso + tipo de dado + nome escolhido*/

    //Dicas: atributo siempre é privado ou private
    // Declarando atributos:
    private String nome;
    private Integer idade;
    private Double peso;
    private double altura;
    private String corOlho;
    private LocalDate dataNascimento;
    private char genero;
    private Boolean isTrabalhador;
    // Maiormente qunado se utiliza um Booleano se coloca na nomenclatura ISNome

    //FALANDO DE CONSTRUTOR
    /*Construtor: informa para Java como um objeto deve ser obrigatoriamente criado
    y quais sao as informações obrigatórias para criar essa pessoa */
    // Dica: Construtor e método(funções) sempre são públicos
    // construtor sempre vai ter o mesmo nome da classe.
    // Criando um construtor vazio:
    public Pessoa() {
    }//exemplo de construtor vazio que nao obriga nemhuma informação

    // Criando um construtor não vazio e com parametros: Botão direiro - generate - construtor ou o atalho alt insert
    public Pessoa(String nome, Integer idade, LocalDate dataNascimento, char genero) {
        this.nome = nome;// 'this' vai sinalizar para Java que me estoy refiriendo a la Classe
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    /* CRIANDO METODOS E FUNCOES: determina as açōes ou responsabilidades do objeto.
    Estrutura: modificador de acesso (PUBLIC OU PRIVATE)+ tipo de retorno (VOID OU OS TIPOS DE RETONO/TIPO DE DADOS)+ nome escolhido: deve
    iniciar com um verbo*/

    //Método sin retorno ou void:
    public void respirar() {
        //todo que estiver aqui dentro é responsável pela açao de respirar
        //void: tipo de retorno que no tiene ningún retorno, no precisa dar uma saída pra Java
        System.out.println("O(a)"+ " " + nome + " " + "está respirando");
    }

    //Método con retorno:
    public Boolean piscarOlhos() { //método com tipo de retorno Boolean
        if (corOlho.equals("Azul")) { //se olho for azul
            System.out.println("Verdadeiro");
            return true; //retorna verdadeiro
        }
        System.out.println("Falso");
        return false;//retorna falso
    }

    //Método con retorno con parametro:
    public String atribuirTitulo(Boolean isCasado) {
        //Se for do genero Feminino (F) e for casado (is Casado) chamaremos de Senhora
        // Se for do genero Feminino(F) e for solteiro (is Casado) chamaremos de Senhorita

        if (this.genero == 'F' && isCasado == true) {
            return "Senhora" + " " + this.nome;
        }

        if (this.genero == 'F' && isCasado == false) {
            return "Senhorita" + " " + this.nome;
        }

        return "Essa pessoa é um Senhor";
    }

        /* getters (permite que a Diana pegue e leia o que está dentro do atributo) and setters (permite modificar o valor do
atributo */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCorOlho() {
        return corOlho;
    }

    public void setCorOlho(String corOlho) {
        this.corOlho = corOlho;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Boolean getTrabalhador() {
        return isTrabalhador;
    }

    public void setTrabalhador(Boolean trabalhador) {
        isTrabalhador = trabalhador;
    }
}

// Esse TUDO aqui é uma generalización que puede ser usado en un objeto






