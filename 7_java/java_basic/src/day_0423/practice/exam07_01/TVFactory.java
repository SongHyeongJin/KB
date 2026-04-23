package day_0423.practice.exam07_01;

public class TVFactory extends Factory implements IWorkingTogether {
    public TVFactory(String name, int openHour, int closeHour){
        super(name,openHour,closeHour);
    }
    @Override
    public int makeProducts(char skill) {
        int total= switch (skill){
            case 'A'->8;
            case 'B'->5;
            case 'C'->3;
            default -> 1;
        };
        return total*getWorkingTime();
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
//        return ((Factory) partner).makeProducts('C');
        if (partner instanceof Factory factory) {
            return factory.makeProducts('C');
        }
        throw new IllegalArgumentException("캐스팅 실패");
    }
}
