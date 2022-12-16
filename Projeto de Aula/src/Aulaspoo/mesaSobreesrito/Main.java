package Aulaspoo.mesaSobreesrito;

public class Main {

    public static void main(String[] args) {

        AssociadoHabilitado associado1 = new AssociadoHabilitado("M001", "João", 90.00, "Musculação", 50.00, true);
        AssociadoHabilitado associado2 = new AssociadoHabilitado("M002", "Paulo", 90.00, "Musculação", 50.00, false);
        checaValorMensalAssociado(associado1);
        checaValorMensalAssociado(associado2);
    }

    public static void checaValorMensalAssociado(AssociadoHabilitado associado) {
        String status;

        if (associado.isHabilitado() == true) {
            status = "é habilitado";
        } else {
            status = "não é habilitado";
        }

        System.out.println("O usuário " + associado.getNome() + " realiza " + associado.getAtividade().toLowerCase() + " e " + status + " a usar a piscina. Dessa forma, sua mensalidade é de R$" + associado.custoMensal());
    }
}
