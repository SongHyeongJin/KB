package day_0423.practice.exam07_01;

public class CarFactory extends Factory implements IWorkingTogether {

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
        // workTogether 메소드는 파트너 공장의 기술력 ’B’에 대한 하루 생산량을 리턴합니다.
        // partner를 Factory 쪽으로 바라보면 makeProducts(...)에 접근할 수 있다.
        // return ((Factory) partner).makeProducts('B');
        if (partner instanceof Factory factory) {
            return factory.makeProducts('B');
        }
        throw new IllegalArgumentException("캐스팅 실패");
    }
}
