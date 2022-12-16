package Aulaspoo.aula2;

public class Main {
    public static void main(String[] args) {
        // atalho main ctrl enter

        String texto1 = "galera";
        System.out.println("Olá Mundo!!! Seja bem vindo");
        // atalho sout
        System.out.println(texto1);
        System.out.println(texto1);
        System.out.println(texto1);

    /*os tipos dados primitivos apenas nos permitirem armazenar um valor
    Por exemplo: int,float, double e char. */
    /*Além dos tipos primitivos, temos as classes própias do Java que é um
    elemento que, além de armazenar um valor, nos permite realizar certas
    OPERAÇŌES que já estão programadas, chamamos esses métodos de operaçōes.
    Por exemplo: string é uma classe, por tanto, é inicicializada em maiúsculas */

        //Lembrete: todas as classes WRAPPERS englobam dentro de si os seus respectivos tipos primitivos

        // Dica: a unica exceção para essa regra é String, sempre será WRAPPER. As demais devem ser usadas conforme sua necessidade

    /*Diferença de tipo primitivo para Wrapper:
     1. Tipo Primitivo (Inicial Minúscula) serve apenas para armazenar valor.
     2. Dica: se colocar um ponto(.) após uma variável primitiva perceberá
              que não tem nemhuma sugestão de método ou função.
     3. Wrapper (Inicial Maiúscula): é uma classe que engloba o tipo primitivo.
        Ela permite além de armazenar o valor, realizar operaçōes já programadas,
        permite receber o valor null */

        String nome;//WRAPPER: aceita qualquer tipo de texto, recebe um conjunto de caracteres;
        Integer idade = 0; //WRAPPER: aceita números inteiros, null e possibilita funçōes já definidas;
        Float valorDecimal1 = 0.0F; //WRAPPER: aceita números decimais, null e possibilita funçōes já definidas;
        Double valorDecimal2 = 0.0; //WRAPPER: aceita números decimais, null e possibilita funçōes já definidas, maior que float
        Boolean valorVerdadeiroOuFalso; //WRAPPER: considera verdadeiro ou falso e possibilita funçōes já definidas;

        String sexo = "M"; //PRIMITIVO char: aceita somente um único caractere,somente armazena valor;
        int mes = 12; //PRIMITIVO: aceita somente números inteiros, somente armazena valor;
        float valorAgua = 109.99F; //PRIMITIVO: aceita números com casas decimales, somente armazena valor;
        double saldoBancario = 12348588484.25; //PRIMITIVO: aceita números com casas decimais, somente armazena valor, maior que
        boolean eDia = true; //PRIMITIVO: considera verdadeiro ou false, somente armazena valor.
    }
}


