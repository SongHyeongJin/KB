package day_0423.practice.exam02;

public class Tv {
    protected String color;
    protected boolean power;
    protected int channel;

    public Tv(){
        color="black";
        power=false;
        channel=0;
    }
    public void power(){
        power=!power;
    }
    public void channelUp(){
        channel+=1;
    }
    public void channelDown(){
        channel-=1;
    }
    public void print(){
        System.out.println("color :"+color+"     power:"+power+"     channel:"+channel);
    }

}
