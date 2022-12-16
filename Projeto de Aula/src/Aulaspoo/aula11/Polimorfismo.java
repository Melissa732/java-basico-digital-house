package Aulaspoo.aula11;

//polimorfismo é uma ligacao dinâmica, como um plugue por exemplo,
//vários tipos de tomada podem ser conectadas nele
public class Polimorfismo {

    public static void main(String[] args) {
        //Relaciionamento do tipo E UM.Doberman(Objeto) é um Doberman (Referencia/molde/modelo).
        //Um Doberman E DO TIPO Doberman?
        Doberman cachorro =new Doberman("Jack", 7,2);
        cachorro.latir();
        cachorro.morderComoDoberman();

        //Um Doberman(Objeto) E UM Cachorro (Referencia)
        //Um Doberman E O TIPO Cachorro?
        cachorro cachorro1 = new Doberman("Bolinha",3,2);
        cachorro1.latir();
        ((Doberman) cachorro1).morderComoDoberman();

        //Em Java todas as classes herdam de Object, portanto um Doberman é um Object
        //Um Doberman E DO TIPO object?
        Object cachorro2 = new Doberman ("Scooby",12,4);
        ((Doberman) cachorro2).latir();
        ((Doberman) cachorro2).morderComoDoberman();

        //Seria possível usar a forma abaixo? Nao, porque um cachorro (Objeto) nao é
        //necessariamente um Doberman
        //Um cachorro E DO TIPO Doberman?
        //Doberman cachorro3 = new cachorro();
    }
}
