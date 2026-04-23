package day_0423.practice.exam05_01;

public class Video extends Content{
    private String genre;

    public Video(String title, String genre){
        setTitle(title);
        setGenre(genre);
    }

    @Override
    public void totalPrice() {
        int priceset = switch (getGenre()){
            case "new"->2000;
            case "comic"->1500;
            case "child"->1000;
            default -> 500;
        };
        setPrice(priceset);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
