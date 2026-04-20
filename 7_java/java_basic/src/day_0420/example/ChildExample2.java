package day_0420.example;

public class ChildExample2 {
    public static void main(String[] args) {
        Parent2 parent2 = new Child2();

        parent2.field1 = "data1";
        parent2.method1();
        parent2.method2();
//        parent2.field2 = "data2";
//        parent2.method3();

        Child2 child = (Child2) parent2;
        child.field2= "data2";
        child.method3();
    }
}
