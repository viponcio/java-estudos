package br.ufsm.csi.exercicio2;

public class SecondClass extends MyClass {

    void imprime(){
        System.out.println(MyClass.nome+ " SecondClass " + new MyClass().sobrenome );//não precisou fazer uma instância para acessar nome
        MyClass.Show();
        new MyClass().imprime();


    }

    static void Show(){//metodos estaticos não são sobrescritos
        System.out.println(MyClass.nome + " " + new MyClass().sobrenome);
    }

    static void Show(int a){//metodos estaticos não são sobrescritos
        System.out.println(MyClass.nome + " " + new MyClass().sobrenome);
    }


}
