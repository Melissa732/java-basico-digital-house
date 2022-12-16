package Aulaspoo.aula7e8;

public class ExemploRelacaoAgregacaoComputador {

    //o computador precisa de um mouse para funcionar, porém o mouse pode ser usado em
    // outros aparelhos por exemplo

    private String marca;
    private String modelo;
    private ExemploRelacaoAgregacaoMouse mouse;

    public ExemploRelacaoAgregacaoComputador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        ExemploRelacaoAgregacaoMouse mouse2 = new ExemploRelacaoAgregacaoMouse();
    }

    public void testeClasse(ExemploRelacaoAgregacaoMouse mouse1){

    }
}
