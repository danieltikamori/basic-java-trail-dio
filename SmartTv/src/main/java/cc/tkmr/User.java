package cc.tkmr;

public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.turnOn();
        System.out.println("Is Tv On? " + smartTv.turnedOn);

        smartTv.turnOff();
        System.out.println("Is Tv On? " + smartTv.turnedOn);

        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.nextChannel();

        System.out.println("Actual channel is? " + smartTv.channel);
        System.out.println("Actual volume is? " + smartTv.volume);

        smartTv.changeChannelTo(19);
        System.out.println("Actual channel is " + smartTv.channel);

        smartTv.changeVolumeTo(30);
        System.out.println("Actual volume is " + smartTv.volume);
    }
}
