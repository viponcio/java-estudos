package br.ufsm.csi.exercicio5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        Collections.sort(numeros);
        for(Integer binarySearchTest:numeros){
            System.out.println("numeros ordenados:"+numeros);
        }

        //para usar esse metodo a lista já deve estar ordenada
//        Collections.binarySearch(numeros,1);

//        if(Collections.binarySearch(numeros,2)){
//
//        }
        System.out.println("procurando o num :"+numeros.get(Collections.binarySearch(numeros,2)));
    }
}
