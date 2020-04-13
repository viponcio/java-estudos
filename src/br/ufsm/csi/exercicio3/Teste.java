package br.ufsm.csi.exercicio3;

public class Teste {

    public static void main(String[] args) {

        System.out.println(TipoProduto.ALIMENTICIO);
        for(TipoProduto tipoProduto : TipoProduto.values()){
            System.out.println(tipoProduto.ordinal() + 1 +":" +tipoProduto.name());
            System.out.println("Exemplo :"+tipoProduto.getDescricao());
        }
    }
}
