package day_0423.practice.exam02;

public class Book {
    private String title;
    private int price;

    public Book(){};
    public Book(String title, int price){
        setTitle(title);
        setPrice(price);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
