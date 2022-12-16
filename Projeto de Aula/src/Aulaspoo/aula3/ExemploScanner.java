package Aulaspoo.aula3;

import java.util.Locale;
import java.util.Scanner;

public class ExemploScanner {

    /*Crie um programa que solicite ao usuário seu nome, departamento, número de registro e o salário.
    O programa deve exibir esses Dados */

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Locale.setDefault(new Locale ("pt", "BR"));

        String nome; //variable
        String departamento;
        Integer numeroRegistro;
        Double salario;

        //Cria um scanner para recuperar os dados digitados pelo usuário
        //Scanner: é uma classe fornecido pelo JAVA que permite que a gente solicite para um usuário que ele digite os dados que vai preencher nossas variavels

        Scanner scanner = new Scanner(System.in); //Linha pradão QUE PERMITE COLOCAR DADOS NA CONSOLE, só vai mudar a classe (neste exemplo Scanner)
        // Scanner é só um classe/modelo, colocar new permite que o modelo vire um objeto palpavél
        System.out.println("Qual é seu nome?");
        nome = scanner.next(); //ou nextLine() é igual ao next(),recupera a String digitada no console
        System.out.println("Qual o seu apartamento?");
        departamento = scanner.next(); //ou nextLine() recupera a String digitada no console
        System.out.println("Qual o seu número de registro?");
        numeroRegistro = scanner.nextInt(); //recupera int digitada no console
        System.out.println("Qual o seu salário?");
        salario = scanner.nextDouble();//recupera o double digitada no console

        //para exibir os dados, para saída dos dados
        System.out.println("O colaborador(a)" + nome + " ,departamento: "+ departamento +
                ". Número de registro n*" + numeroRegistro + " recebe mensalmente R$" + salario);
    }
}
