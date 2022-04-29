public class LampControl {
    public LampControl(String canal,cloudLamp a){
        channel = Integer.parseInt(canal);
        lampara = a;
    }
    public int getChannel(){return channel;}
    public void pressPower(){
        lampara.changeLampPowerState(channel);
    }
    public void controlarLamp(Action a){
        lampara.conectarNube(channel, a);
    }
    public int getStateLamp(){
        return(lampara.estadoLamp(channel));
    }
    private int channel;
    private cloudLamp lampara;
}
