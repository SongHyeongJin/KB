package day_0423.practice.exam05_01;

 public abstract class Beverage {
    private String name;
    protected int price;

    public Beverage(String name) {

        this.name = name;
    }

    abstract public void calcPrice();


    public String getName() {

        return name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
