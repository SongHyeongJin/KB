package day_0423.study.car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

//        car.setCarSn("1111");
//        car.setCarName("BMW5200");
//        car.setCarPrice(8500000);
//        car.setCarOwner("홍길동");
//        car.setCarYear("2010");
//        car.setCarType("G");
        String carSn="1111";
        String carName="BMW5200";
        int carPrice=8500000;
        String carOwner="홍길동";
        String carYear="2010";
        String carType="G";
        CarDTO dto = new CarDTO();
        dto.carSn = carSn;
        dto.carName = carName;
        dto.carPrice = carPrice;
        dto.carOwner = carOwner;
        dto.carYear=carYear;
        dto.carType=carType;

        System.out.println(dto.toString());

    }
}
