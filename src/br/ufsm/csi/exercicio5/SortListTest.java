package br.ufsm.csi.exercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();//mantem a ordem no indice
        nomes.add("Vitoria");
        nomes.add("Kuntz");
        nomes.add("Poncio");
        nomes.add("Silvane");
        nomes.add("Teresinha");
        nomes.add(0,"José");

        Collections.sort(nomes);//ordenará a string como dela deve ser ordenada,ou seja,pela ordem alfabética

        for(String nome: nomes){
            System.out.println(nome);
        }

        List<Double> num = new ArrayList<>();
        num.add(2.6);
        num.add(6.90);
        num.add(6.0);

        Collections.sort(num);//irá ordenar os números

        for(Double numeros:num){
            System.out.println(numeros);
        }

    }
}
