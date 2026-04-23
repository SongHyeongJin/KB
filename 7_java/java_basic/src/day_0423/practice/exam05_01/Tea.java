package day_0423.practice.exam05_01;

public class Tea extends Beverage {
    static int amount;

    public Tea(String name) {
        super(name);
        calcPrice();
        amount++;
    }

    @Override
    public void calcPrice() {
        if(getName().equals("lemonTea")) {
            setPrice(1500);
        } else if(getName().equals("ginsengTea")) {
            setPrice(2000);
        } else if(getName().equals("redginsengTea")) {
            setPrice(2500);
        } else {
            System.out.println("존재하지 않는 메뉴입니다.");
        }
    }
}