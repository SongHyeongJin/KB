package day_0427.Generic;

public class Product <K, M>{//타입 파라메터 K, M 선언

    //필드
    private K kind;
    private M model; //타입 파라메터를 필드타입으로 선언

    public K getKind(){
        return this.kind;
    }
    public void setKind(K kind){
        this.kind = kind;
    }
    public M getModel(){
        return this.model;
    }
    public void setModel(M model){
        this.model = model;
    }

}
