package br.ufsm.csi.exercicio1;

public enum TrueorFalse {
    FALSEEE(0,"false"), TRUE(1,"true");

    private int index;
    private String desc;

    TrueorFalse(int index, String desc) {
        this.index = index;
        this.desc = desc;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
