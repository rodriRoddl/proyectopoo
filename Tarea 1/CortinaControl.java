public class CortinaControl{
    //falta programar para los estados de la cortina
    public CortinaControl(String canal,cloudCortina a){
        channel = Integer.parseInt(canal);
        //cortina = a;
    }
    public int getChannel(){return channel;}
    public void pressPower(){
    //    cortina.changeLampPowerState(channel);
    }
    public void controlarLamp(Action a){
    //    cortina.conectarNube(channel, a);
    }
    public int getStateLamp(){
    //    return(cortina.estadoLamp(channel));
    return 0;
    }
    private int channel;
    //private cloudCortina cortina;
}
