package day_0420.dogcat.objectCasting;

import day_0420.dogcat.hire.Cat;
import day_0420.dogcat.hire.Dog;
import day_0420.dogcat.hire.Animal;

public class ObjectCasting {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();

        ((Cat)ani).night();
    }
}
