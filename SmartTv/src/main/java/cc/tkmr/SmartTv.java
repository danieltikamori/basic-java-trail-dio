package cc.tkmr;

public class SmartTv {
    boolean turnedOn = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        turnedOn = true;
    }
    public void turnOff() {
        turnedOn = false;
    }

    public void changeChannelTo(int newChannel) {
        channel = newChannel;
    }
    public void changeVolumeTo(int newVolume) {
        volume = newVolume;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    public void nextChannel() {
        System.out.println("Next channel");
        channel++;
    }
    public void previousChannel() {
        System.out.println("Previous channel");
        channel--;
    }
    public void volumeUp() {
        volume++;
        System.out.println("Increase volume to " + volume);
    }
    public void volumeDown() {
        volume--;
        System.out.println("Decrease volume to " + volume);
    }

}
