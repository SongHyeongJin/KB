package day_0420.example;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();
//        parent.method3(); Parent에 정의되어있지 않음
    }
}
