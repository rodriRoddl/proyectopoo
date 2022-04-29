public class CortinaControl{
    //Constructor
    public CortinaControl(String canal,cloudCortina a){
        channel = Integer.parseInt(canal);
        cloud = a;
    }
    //metodos
    public int getChannel(){return channel;}

    public void conectAction(Action a){
        cloud.startAction(channel, a);
    }
    //atributos
    private int channel;
    private cloudCortina cloud;
}
