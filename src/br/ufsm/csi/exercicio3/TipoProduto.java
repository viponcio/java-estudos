package br.ufsm.csi.exercicio3;

public enum TipoProduto {
    ELETRODOMESTICO("11" , "liquidificador"), BRINQUEDO("26","boneca"),
    ALIMENTICIO("55","Verdura"), FARMACO("62","paracetamol"),
    NATURAL("55","alface")

    ;

    private String cod;
    private String descricao;

    TipoProduto(String cod, String descricao) {//só vou poder inserir o cod e descricao com o construtor
        this.cod = cod;
        this.descricao = descricao;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
