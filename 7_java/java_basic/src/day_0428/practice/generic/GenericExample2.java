package day_0428.practice.generic;


public class GenericExample2 {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트 Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();

        System.out.println("종류 : "+tv+", 모델 : "+tvModel);
        System.out.println("종류 : "+car+", 모델 : "+carModel);

    }
}
