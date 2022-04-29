public class LampControl {
    public LampControl(String canal,cloudLamp a){
        channel = Integer.parseInt(canal);
        cloud = a;
    }
    public int getChannel(){return channel;}
    public void pressPower(){
        cloud.changeLampPowerState(channel);
    }
    public void controlarLamp(Action a){
        cloud.conectarNube(channel, a);
    }
    public int getStateLamp(){
        return(cloud.estadoLamp(channel));
    }
    private int channel;
    private cloudLamp cloud;
}
