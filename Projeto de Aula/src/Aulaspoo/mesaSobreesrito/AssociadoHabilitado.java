package Aulaspoo.mesaSobreesrito;

public class AssociadoHabilitado extends Associado {

    private Double custoPiscina;
    private boolean habilitado;


    public AssociadoHabilitado(String numAssociado, String nome, Double valorMensal, String atividade, Double custoPiscina, boolean habilitado) {
        super(numAssociado, nome, valorMensal, atividade);

        this.custoPiscina = custoPiscina;
        this.habilitado = habilitado;
    }

    @Override

    public Double custoMensal() {

        if (habilitado) {

            return getValorMensal() + custoPiscina;
        }

        return getValorMensal();
    }

    public Double getCustoPiscina() {
        return custoPiscina;
    }

    public void setCustoPiscina(Double custoPiscina) {
        this.custoPiscina = custoPiscina;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
