package day_0423.practice.exam01;

public class Drink {
    protected String name;
    protected int price;
    protected  int count;

    public Drink(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public int getTotalPrice(){
        return price*count;
    }
    public void printTitle(){
        System.out.println("상품명    단가       수량       금액");
    }
    public void printData(){
        System.out.printf("%s      %d      %d         %d\n", name, price, count, this.getTotalPrice());
    }
}
