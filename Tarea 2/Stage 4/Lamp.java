

public class Lamp {
    public Lamp (int channel){
        this.channel= channel;
        r = g = b = 255;
        state = LampState.OFF;
    }
    public int getChannel(){
        return channel;
    }
    public void changePowerState(){
        state = state==LampState.ON ? LampState.OFF : LampState.ON;
        }
    private int channel;
    private short r,g,b;
    private LampState state;
}

