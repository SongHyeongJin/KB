package day_0416.practice;

public class Car {

//        String model; //null
//        boolean start; // false
//        int speed; //0
//        String color;
//        int maxspeed;
//        public Car(String m, String c, int max){
//                model=m;
//                color=c;
//                maxspeed=max;
//        }
        String company = "현대자동차";
        String model;
        String color;
        int maxSpeed;
        public Car(){
                this("그랜저", "흰색", 250);
        }
        public Car(String model){
                this(model,"흰색",250);
        }
        public Car(String model, String color){
                this(model, color, 250);
        }
        public Car(String model, String color, int maxSpeed){
                this.model = model;
                this.color = color;
                this.maxSpeed = maxSpeed;
        }
}
