package day_0427.Generic;

public class HomeAgency implements Rentable<Home>{

    @Override
    public Home rent() {
        return new Home();
    }
}
