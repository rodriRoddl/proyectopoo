public class CortinaControl{
    //Constructor
    public CortinaControl(String canal,cloudCortina a){
        channel = Integer.parseInt(canal);
        cloud = a;
    }
    //metodos
    public int getChannel(){return channel;}

    public void startUp(){
       cloud.startUp(channel);
    }
    public void startDown(){
        cloud.startDown(channel);
    }
    public void stopMove(){
        cloud.stopMove(channel);
    }
    //atributos
    private int channel;
    private cloudCortina cloud;
}
