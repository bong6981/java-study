package practice.Pr6;

public class Pr6_19 {
    public static void main(String[] args) {
        Tv t = new Tv();
        t.channel = 100;
        t.volume = 0;
        System.out.println(t.channel + "," + t.volume);
        t.channelDown();
        t.volumeDown();
        System.out.println(t.channel + "," + t.volume);
        t.volume =100;
        t.channelUp();
        t.volumeUp();
        System.out.println(t.channel + "," + t.volume);
    }


}

class Tv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOff(){
        if(this.isPowerOn==true){
            this.isPowerOn=false;
        }else{
            this.isPowerOn=true;
        }
    }

    void volumeUp() {
        if(this.volume<MAX_VOLUME){
            this.volume += 1;
        }
    }

    void volumeDown() {
        if(this.volume>MIN_VOLUME)
            this.volume -= 1;
    }

    void channelUp(){
        if(this.channel==MAX_CHANNEL){
            this.channel=MIN_CHANNEL;
        }else{
            this.channel += 1;
        }
    }

    void channelDown(){
        if(this.channel==MIN_CHANNEL){
            this.channel = MAX_CHANNEL;
        }else {
            channel -= 1;
        }
    }
}
