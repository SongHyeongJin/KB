package day_0420.ch07;

public class SnowTireExample08 {
    public static void main(String[] args) {
        SnowTire08 snowTire = new SnowTire08();
        Tire08 tire = snowTire;

        snowTire.run();
        tire.run();
    }
}
