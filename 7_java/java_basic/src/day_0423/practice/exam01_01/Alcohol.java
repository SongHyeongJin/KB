package day_0423.practice.exam01_01;

public class Alcohol extends Drink {
    double alcper;

    Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }

    @Override
    public void printTitle() {
        System.out.println("상품명(도수[%])\t단가\t\t수량\t\t금액");
    }

    @Override
    public void printData() {
        System.out.println(name + "(" + alcper + ")" + "\t\t" + price + "\t" + count + "\t\t" + getTotalPrice());
    }
}
