package day_0429.student.todo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex06ComparatorLambdaTodo {
    static class Product {
        String name;
        int price;
        Product(String name, int price) { this.name = name; this.price = price; }
        public String toString() { return name + ": " + price; }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("키보드", 30000));
        products.add(new Product("마우스", 15000));
        products.add(new Product("모니터", 200000));

        // TODO: 가격 오름차순으로 정렬하는 람다식을 작성하세요.
//        products.sort((p1, p2)-> Integer.compare(p1.price, p2.price));

        products.sort(Comparator.comparingInt(p->p.price));
        System.out.println(products);
        for(Product product : products){
            System.out.println(product);
        }
    }
}
