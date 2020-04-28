package br.ufsm.csi.exercicio5;

import java.lang.reflect.Array;
import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto>{
//classe externa
    @Override
    public int compare(Produto produto1, Produto produto2) {
        return produto1.getNome().compareTo(String.valueOf(produto2));
    }
}
public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Produto[] produtosArray = new Produto[3];

        Produto produto1=new Produto("50","Panela",55.2);
        Produto produto2=new Produto("59","Garfo",5.2);
        Produto produto3=new Produto("5","Faqueiro",53.2);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        produtosArray[0] = produto1;
        produtosArray[1] = produto2;
        produtosArray[2] = produto3;

//        Collections.sort(produtos, new ProdutoNomeComparator());

        for(Produto produto:produtos){
            System.out.println(produto);
        }

        Arrays.sort(produtosArray);
        for(Produto produto: produtosArray){
            System.out.println("produtos ordenados:"+produto);
        }
//        System.out.println("produtos naõ ordenados por array:"+Arrays.toString(produtosArray));

    }
}
