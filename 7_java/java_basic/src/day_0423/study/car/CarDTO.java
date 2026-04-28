package day_0423.study.car;

public class CarDTO {
    public String carSn;
    public String carName;
    public int carPrice;
    public String carOwner;
    public String carYear;
    public String carType;

    @Override
    public String toString() {
        return "CarDTO{" +
                "carSn='" + carSn + '\'' +
                ", carName='" + carName + '\'' +
                ", carPrice=" + carPrice +
                ", carOwner='" + carOwner + '\'' +
                ", carYear='" + carYear + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}
