package Aulaspoo.aula10;

import java.time.LocalDate;

public class Main {

    // NA HERANCA, nao se cria objetos da classe pai, só da classe filho
    // Se coloca "L" no CPF para saber que é longe
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ivy",23779711800L, 20.0);
        System.out.println(aluno.calcularIdade(LocalDate.of(1989,04,25)));
        aluno.calcularImc(30);

        Empregado empregado = new Empregado("José", 3662728l, 50000.00, 3.00);
        System.out.println(empregado.calcularIdade(LocalDate.of(1999,12,17)));
        empregado.calcularImc(65);
        //en el método calcularIdade se pone printIn, porque en el método no hay.

        System.out.println( empregado.calcularSalario(50.00, 8.5));
        System.out.println(empregado.calcularSalario(100.00));

    }
}
