package Aulaspoo.aula11;

public class Doberman extends cachorro{

    private String nomePai;
    private Float peso;

    public Doberman(String nome, int idade, Integer numero) {
        super(nome, idade, numero);
    }
    public Doberman(String nome) {
        super(nome);
    }

    @Override
    public void latir() {
        System.out.println("Late como Doberman AU AU AU");
    }

    public void morderComoDoberman(){
        System.out.println(" Nunca fui mordida por um. Portanto nao sei!");
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
}
