package br.ufsm.csi.exercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListaArraysTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        Integer[] numerosArray = new Integer[numeros.size()];//estou copiando os numeros para dentro desse array
        numeros.toArray(numerosArray);//retorna uma lista de objs
        System.out.println("lista:"+numeros);
        System.out.println("array:"+ Arrays.toString(numerosArray));

        Integer[] numerosArray2 = new Integer[4];
        numerosArray2[0] = 22;
        numerosArray2[1] = 0;
        numerosArray2[2] = 42;
        numerosArray2[3] = 13;

        List<Integer> numeros2 = Arrays.asList(numerosArray2);
        numeros2.set(1,4);//é possivel porém numeros2.add não é
//        numeros2.add(55);
        List<Integer> numeros3 = new ArrayList<>();
        //coloca os valores de uma lista
        numeros3.addAll(Arrays.asList(numerosArray2));
        System.out.println("lista:"+numeros2);
        System.out.println("array:"+Arrays.toString(numerosArray2));
        System.out.println("numeros3:"+numeros3);

    }
}
