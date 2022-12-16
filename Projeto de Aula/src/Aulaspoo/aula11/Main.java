package Aulaspoo.aula11;

public class Main {
    public static void main(String[] args) {

        Doberman duque = new Doberman("Duque");
        duque.setNome("Jack");
        duque.latir();

        Poodle rodolfo = new Poodle("Rodolfo");
        rodolfo.latir();
    }
}
