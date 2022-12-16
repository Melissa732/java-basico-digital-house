package Aulaspoo.aula4;

import java.util.Scanner;

public class ExercicioSintaxe {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        Integer dataDeNascimentoDia;
        Integer dataDeNascimentoMes;
        Integer dataDeNascimentoAno;

        // Declarando e instanciando um scanner

        Scanner minhaTentativa= new Scanner(System.in);

        // Solicitação e armazenamento de inputs nas variáveis

        System.out.println("Qual é seu nome?");
        nome= minhaTentativa.nextLine();

        System.out.println("Qual é seu sobrenome?");
        sobrenome= minhaTentativa.nextLine();

        System.out.println("Qual é seu dia do nascimento?");
        dataDeNascimentoDia= minhaTentativa.nextInt();

        System.out.println("Qual é seu mes do nascimento?");
        dataDeNascimentoMes= minhaTentativa.nextInt();

        System.out.println("Qual é seu ano do nascimento?");
        dataDeNascimentoAno= minhaTentativa.nextInt();

        // Imprimir mensagem com as informações no terminal

        System.out.println(nome+" "+ sobrenome + " (" + nome.charAt(0) + sobrenome.charAt(0) + ") | " + dataDeNascimentoDia +"/"+ dataDeNascimentoMes
                + "/" + dataDeNascimentoAno);
    }
}
