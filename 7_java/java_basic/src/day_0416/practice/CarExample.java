package day_0416.practice;

public class CarExample {
    public static void main(String[] args) {
//        Car mycar = new Car();
//        System.out.println("모델명: " + mycar.model);
//        System.out.println("시동여부: " + mycar.start);
//        System.out.println("현재속도: " + mycar.speed);
//        Car mycar = new Car("그렌저", "검정", 250);
//        System.out.println("모델명: "+mycar.model);
//        System.out.println("색상: "+mycar.color);
//        System.out.println("현재속도: "+mycar.maxspeed);
        Car car1 = new Car();
        Car car2 = new Car("자가용");
        Car car3 = new Car("자가용", "빨강");
        Car car4 = new Car("택시", "검정", 200);
        System.out.println("car1.company : "+car1.company);
        System.out.println();
        System.out.println("car2.company : "+car2.company);
        System.out.println("car2.model : "+car2.model);
        System.out.println();
        System.out.println("car3.company : "+car3.company);
        System.out.println("car3.model : "+car3.model);
        System.out.println("car3.color : "+car3.color);
        System.out.println();
        System.out.println("car4.company : "+car4.company);
        System.out.println("car4.model : "+car4.model);
        System.out.println("car4.color : "+car4.color);
        System.out.println("car4.maxspeed : "+car4.maxSpeed);
    }
}
