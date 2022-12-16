package Aulaspoo.aula11;

public class Poodle extends cachorro{

    public Poodle(String nome, int idade, Integer numero) {
        super(nome, idade, numero);
    }

    public Poodle(String nome) {
        super(nome);
    }

    //Sobreescrita
    @Override
    public void latir(){
        System.out.println("Late como poodle au au");
    }
}
