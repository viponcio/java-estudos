package br.ufsm.csi.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class ListCelular {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Iphone 9","665520");
        Celular celular2 = new Celular("Nokia Tijolão","555520");
        Celular celular3 = new Celular("Widows Phone","896520");

        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for(Celular celular:celularList){
//            System.out.println(celular);//imprime do ToSring
            System.out.println(celular.getNome());//imprime os nomes do celulares
        }
        Celular celular4= new Celular("Xiaomi mi 8","988522");
        System.out.println("celular1 é igual ao celular4?"+celular1.equals(celular4));//irá retornar true ou false
        System.out.println("xiaomi mi 8 está na lista de celulares? "+celularList.contains(celular4));
    }
}
