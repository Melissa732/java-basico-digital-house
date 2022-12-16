package Aulaspoo.aula7e8;

public class ExplicacaoRelacionamentos {
    /*
    - Relacoes entre as classes dizem como os objetos se comunican entre si e como trocam mensagens.

    - A cardinalidade em java deve ser observada pra ver se implementa no java como atributo ou como
    array ou list.

    -  Associacao -------> : TEM ou SABE ------UNILATERAL. DESCREVE UMA CONEXAO ENTRE OBJETOS. EX.: classe
    A conhece classe B, mas classe B nao conhece classe A. Exemplo: Pessoa e endereco, uma pessoa
    SABE seu endereco, mas o endereco nao sabe quem mora lá.

    - Agregação ------<> losango:FAZ PARTE DE ----- Uma n depende da outra/ Quando A CLASSE NAO APENAS POSSUI OU CONHECE
    OUTRA MAS TAMBEM FAZ PARTE DELA. EX: uma bicicleta é composta de vários outros elementos (objetos),
    como rodas, pedais, freios e chassi. Por meio de um processo de montagem, juntamos os elementos e formamos
    uma bicicleta.
    O que acontecerá se fizermos o processo reverso, no caso de desmortarmos a bicicleta? Os outros elementos
    ainda existem e servem ao seu propósito? A resposta é sim, pois cada elemento pode ser utilizado
    em outra bicicleta, ou até mesmo em outro tipo de transporte como um triciclo ou monociclo. Existe
    uma relacao entre os agregados e o todo, mas os componentes podem existir mesmo que o todo seja destruído.

    - Composicao -----<> so que losango é preenchido: SEM o TODO QD UMA CLASSE é COMPOSTA PRA OUTRA CLASSE.
    EX: pessoa é feita de orgãos. é o caso em que uma clsse de objeto A "POSSUI" uma classe de objeto B, e B nao tem
    razao de existir sem A.

    - Os RELACIONAMENTOS PODEM tar como um atributo, no construtor, e no metodo

    - PODE FORCAR A TER NO CONTRUTOR.:

    - Diference de agregacao e composicao: na composicao uma classe é composta por outra, por tanto uma das classes nao
    faz sentido por si mesma e depende da outra, sendo que na agregacao um pode existir sem a outra.
     */
}
