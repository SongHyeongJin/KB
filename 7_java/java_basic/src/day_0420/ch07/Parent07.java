package day_0420.ch07;

import java.util.SortedMap;

public class Parent07 {
    public String nation;
    public Parent07(){
        this("대한민국");
        System.out.println("Parent() call");
    }
    public Parent07(String nation){
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
