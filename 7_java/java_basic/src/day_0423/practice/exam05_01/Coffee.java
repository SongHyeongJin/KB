package day_0423.practice.exam05_01;

public class Coffee extends Beverage {
    static int amount;

    public Coffee(String name) {
        super(name);
        calcPrice();
        amount++;
    }

    @Override
    public void calcPrice() {
        if(getName().equals("Americano")) {
            setPrice(1500);
        } else if(getName().equals("CafeLatte")) {
            setPrice(2500);
        } else if(getName().equals("Cappuccino")) {
            setPrice(3000);
        } else {
            System.out.println("존재하지 않는 메뉴입니다.");
        }
    }
}
