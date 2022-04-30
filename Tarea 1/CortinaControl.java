public class CortinaControl{
    //Constructor
    public CortinaControl(String canal,cloudCortina a){
        channel = Integer.parseInt(canal);
        cloud = a;
    }
    //metodos
    public int getChannel(){return channel;}

    public void conectAction(Action a,double delta){
        cloud.startAction(channel, a, delta);
    }
        public void saveState() {
        cloud.saveStatus(channel);
    }
    //atributos
    private int channel;
    private cloudCortina cloud;

}
