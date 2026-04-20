package day_0420.dogcat.objectCasting;

public class ABCDEFTest {
    public static void main(String[] args) {
        A a = new A();
        a = new B();
        a = new C();
        a = new C();
        a= new D();
        a= new E();
        a= new F();
        B b = new B();
        b=new D();
        b = new E();
        C c = new C();
        c = new F();
        //업캐스팅

//        B b1 = (B) new A(); 오류
        //다운캐스팅



    }
}
