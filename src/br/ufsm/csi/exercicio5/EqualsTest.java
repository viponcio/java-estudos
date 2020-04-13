package br.ufsm.csi.exercicio5;

public class EqualsTest {
    public static void main(String[] args) {
        String nome1 = "William Suane";//fica armazenado no pool de String
        String nome2 = new String("William Suane");//objeto fica armazenado no heap
        Integer int1 = 5;
        Integer int2 = new Integer(5);


        System.out.println(int1 == int2);
        System.out.println(nome1 == nome2);//== só retorna true se são iguais e estão armazenados no mesmo local de memoria

        //como faço para igualar o significado da variavel não o local de memoria?É só chamar o equals
        System.out.println(int1.equals(int2));
        System.out.println(nome1.equals(nome2));


        Celular c1 = new Celular("IPHONE","58963");
        Celular c2 = new Celular("IPHONE","589644443");
        System.out.println("celular:"+c1.equals(c2));



    }

}
