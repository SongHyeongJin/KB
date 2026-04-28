package day_0423.study.book;

public class BookTest {
    public static void main(String[] args) {
        Book javabook1 = new Book();
        Book javabook2 = new Book("자바", 30000,"fastcampus", "박매일", 500,"123456");
        System.out.println(javabook1.getAuthor());
        System.out.println(javabook2.getAuthor());
        javabook2.setPage(1000);
        System.out.println(javabook2.getPage());
    }
}
