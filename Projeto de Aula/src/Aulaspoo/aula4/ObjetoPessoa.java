package Aulaspoo.aula4;

import java.time.LocalDate;

//CRIANDO NOSSO OBJETO:

public class ObjetoPessoa {
    public static void main(String[] args) {

        //Classe molde -> escolher nomedoObjeto = new classe
        // SE USA NEW PARA CRIAR EN LA MEMORIA DEL COMPUTADOR UM ESPACO PARA CRIAR UM OBJETO FISICO
        Pessoa pessoaFeliz = new Pessoa();

        //Exemplo de construtor vazio
        pessoaFeliz.respirar();

        //Outro exemplo char:
        // Se usa aspa simple para char, se usa aspas dobles para STRING
        Pessoa pessoaHelena = new Pessoa("Helena", 30, LocalDate.now(), 'F');
        pessoaHelena.respirar();
        System.out.println(pessoaHelena.atribuirTitulo(true));
        System.out.println(pessoaHelena.atribuirTitulo(false));

        //Outro Objeto
        Pessoa pessoaLuiz = new Pessoa("Luiz", 38, LocalDate.now(), 'M');
        System.out.println(pessoaLuiz.atribuirTitulo(true));
        // Cuando se tiene un "return", lo tenemos que colocar dentro de System.out.println()


        pessoaHelena.setCorOlho("Azul");
        pessoaHelena.piscarOlhos();

    }
}
