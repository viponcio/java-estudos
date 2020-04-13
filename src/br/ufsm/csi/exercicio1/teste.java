package br.ufsm.csi.exercicio1;

import java.util.Stack;

public class teste {

    public enum Opcao {//opcao é o objeto
        YES,NO//minhas constantes
    }

    public static final String OURO = "ouro"; //sempre que criar uma constante deve ter static final e depois define o tipo
    public static final String PAUS = "paus";
    public static final String ESPADAS = "espadas";
    public static final String COPAS = "copas";

    //todas as constancias em java devem ser static pois elas devem ser acessados em todos os lugares da aplicação

    public static void main(String[] args) {
        TrueorFalse t = TrueorFalse.FALSEEE;
        System.out.println(t);//exatamente o nome da minha constante
        System.out.println(t.getIndex());
        System.out.println(t.getDesc());

        for(TrueorFalse t2 : TrueorFalse.values()){
//            System.out.println(t2);//apresenta os nomes das constantes
            System.out.println(t2.getDesc());
            System.out.println(t2.getIndex());
        }

        Carta carta = Carta.COPAS;

        switch (carta){
            case OURO:
                System.out.println("sua carta é ouro");
                break;
            case PAUS:
                System.out.println("sua carta é paus");
                break;
            case ESPADAS:
                System.out.println("sua carte é espadas");
                break;
            case COPAS:
                System.out.println("sua carte é copas");
                break;
            default:
                System.out.println("nenhuma carta encontrada");
                break;
        }


        String naipe = teste.PAUS;

        switch (naipe){
            case teste.OURO:
                System.out.println("sua carta é ouro");
                break;
            case teste.PAUS:
                System.out.println("sua carta é paus");
                break;
            case teste.ESPADAS:
                System.out.println("sua carte é espadas");
                break;
            case teste.COPAS:
                System.out.println("sua carte é copas");
                break;
            default:
                System.out.println("nenhuma carta encontrada");
                break;
        }
    }



}
