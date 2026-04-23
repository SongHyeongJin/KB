package day_0423.practice.exam07;

public class CarFactory extends Factory implements IWorkingTogether{

    public CarFactory(String name, int openHour, int closeHour){
        super(name,openHour,closeHour);
    }
    @Override
    public int makeProducts(char skill) {
        int total= switch (skill){
            case 'A'->3;
            case 'B'->2;
            case 'C'->1;
            default -> 0;
        };
        return total*getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {

        return ((Factory)partner).makeProducts('B');
    }
}
