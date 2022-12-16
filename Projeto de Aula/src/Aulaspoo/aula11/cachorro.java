package Aulaspoo.aula11;

/*Nao existe algo que seja tipo animal: existem caes, gatos, pássaros. Quando criamos animais vamos criar
cachorros, gatos, etc.

Uma classe abstracta (SEMPRE é SUPERCLASSE) é abstrata porque nunca criamos objetos dela, serve para
AGRUPAR CERTAS CLASSES SOBRE UM CRITERIO ESPECIFICO para COMPARTILHAR características e comportamentos
em comum.Usado com herança.

Classes abstratas são feitas particularmente para serem modelos de suas classes derivadas, que por via de regra,
deverão sobrescrever os métodos dessa classe abstrata para que seja possível a implementacao dos mesmos.
PORTANTO SE DECLARA O METODO NA SUPERCLASSE MAS ELE NAO FAZ NADA, NA SUBCLASSE QUE ELE SERA SOBREESCRITO E
IMPLEMENTADO. */
public abstract class cachorro {

    private String nome;
    private int idade;
    private Integer numero;

    //Sobrecarga no construtor
    public cachorro(String nome, int idade, Integer numero) {
        this.nome = nome;
        this.idade = idade;
        this.numero = numero;
    }

    public cachorro(String nome) {
        this.nome = nome;
    }

    //METODO ABSTRATO:
    //O abstratac obriga a subclasse que herdar a classe Cachorro a implementar esse método
    //Como o método nao é implementado aqui nao se usa {}
    //Define o contrato: obrigatório sobreescrever na filha

    public abstract void latir();

    public void teste(){
        System.out.println("teste");
    }

    //Get and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}
