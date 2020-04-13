package br.ufsm.csi.exercicio5;

import br.ufsm.csi.exercicio1.Carta;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //generics são ncessários em ArrayList,definem o tipo de coleção
        //coleções com tipos primitivos não possuem metodos
        //nao posso criar coleções comm tipo primitivos
        List<String> nomes = new ArrayList();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("vi");
        nomes.add("silvane");

        nomes2.add("valquiria");
        nomes2.add("miranda");

        nomes.clear();//removeu todos os nomes nomes2 permaneceu

        //nomes2 entrou na lista nomes
        nomes.addAll(nomes2);

        nomes.remove("Vi");//case sensitive
        nomes.remove(1);//remoção por indice

        System.out.println("size:"+nomes.size());
        System.out.println(nomes.remove("Vi"));//receberei um boolean

        int size=nomes.size();
        for(int i=0;i< size;i++){
            System.out.println("nomes dentro do for comum:"+nomes.get(i));
            nomes.add("camila");
        }
//        System.out.println(nomes.get(25));//se eu colocar um index maior que o array ele dá IndexOutOfBoundsException
//        for(String nome : nomes){
//            System.out.println(nome);
//        }
//
//        nomes.add("carlos");
//        for(String nome : nomes){
//            System.out.println(nome);
//        }

        List<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(88);

        for(int i=0;i<num.size();i++){
            System.out.println("numeros:"+num.get(i));
        }
    }
}
