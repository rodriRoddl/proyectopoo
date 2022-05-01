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
    public String getStateLamp(){
        return(cloud.getStatus());
    }
    private int channel;
    private cloudLamp cloud;
}
