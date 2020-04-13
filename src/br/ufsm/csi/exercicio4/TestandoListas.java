package br.ufsm.csi.exercicio4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String Aula1="conhecendo collection";
        String Aula2="modelando a aula1";
        String Aula3="trabalhando com cursos e sets";

        ArrayList<String> aulas =new ArrayList<>();//array generico

         aulas.add(Aula1);
         aulas.add(Aula2);
         aulas.add(Aula3);

        System.out.println(aulas);
        aulas.remove(Aula1);
        System.out.println(aulas);

        for (String aula:aulas) {
            System.out.println("Aula: "+aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("Primeira aula é:"+primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula:"+aulas.get(i));
        }

        String aula3 = "Aula de java";
        aulas.add(aula3);
        System.out.println(aulas);

        aulas.forEach(aula -> {
            System.out.println("aulas presentes no curso:"+aula);
        });

        Collections.sort(aulas);//modificou em ordem alfabética
        System.out.println(aulas);



    }
}
