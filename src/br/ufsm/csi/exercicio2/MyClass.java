package br.ufsm.csi.exercicio2;

public class MyClass {
    static String nome = "Ana";//atributo estatico
    String sobrenome ="Monteiro";//atributo de instancia,atributo de instância a gente acessa com uma instância
    void imprime(){
        System.out.println(nome+ " " + sobrenome);
    }

    static void Show(){
        System.out.println(nome + " " + new MyClass().sobrenome);
    }

    public static void main(String[] args) {
//        System.out.println(nome +" "+ sobrenome);//atributo não estatico não pode ser referenciado de um contexto estatico
//        imprime();//mesmo erro de sobrenome é necessário uma instância
        new MyClass().imprime();
        System.out.println(new MyClass().sobrenome);//dessa forma eu consigo acessar o atributo sobrenome
        System.out.println(nome + " " + new MyClass().sobrenome);
        Show();

        SecondClass s = new SecondClass();
        s.imprime();
        SecondClass.Show();
        s.Show();

        MyClass my = new MyClass();
        my.sobrenome = "Silva";
        nome = "Lais";//na linha trinta do meu cód que alterou o nome para lais
//        my.nome = "julia";
        //quando se cria uma instancia tu alterar o atributo
        // apenas o atributo de instancia

        MyClass my2 = new MyClass();
        my2.sobrenome = "Souza";

        MyClass my3 = new MyClass();
        my3.sobrenome = "santos";

        System.out.println(my.sobrenome + my2.sobrenome + my3.sobrenome);
        System.out.println(nome + " " +new MyClass().sobrenome);

    }

}
