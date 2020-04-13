package br.ufsm.csi.exercicio5;

public class Celular {
    private String nome;
    private String IMEI;



    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    //Equals deve ser reflexivo x.equals(x) tem que ser true para tudo que for diferente de nulo
    //Simetrico para se y diferente de null, se x.equals(y) == true logo y.equals(x) tem que ser true
    //transitividade para s,y,z diferente de null , se x.equals(y) for true logo y.equals(x) é true tamb e x.equals(z) == true logo y.equals(z) tamb tem que ser true
    //consistente x.equals(y) deve sempre retornar o mesmo valor
    //para x diferente de null x.equals(null) deve retornar false
    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(this == obj){
            //mesmo endereço de memória
            return true;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Celular outroCelular = (Celular) obj;
        return IMEI != null ? IMEI.equals(outroCelular.getIMEI()) : false;
    }

    //Se x.equals(y) ser true y.hashcodde() == x.hahscode()
    //y.hahscode() == x.hahscode não necessariamente o equals deverá retornar true
    //x.equals(y) == false
    //y.hahscode() diferente de  x.hahscode x.equals(y) deverá ser false

    @Override
    public int hashCode() {
        return IMEI.hashCode();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }
}
