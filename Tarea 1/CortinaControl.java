public class CortinaControl{
    //Constructor
    public CortinaControl(String canal,cloudCortina a){
        channel = Integer.parseInt(canal);
        cloud = a;
    }
    //metodos
    public int getChannel(){return channel;}

    public void conectAction(double delta){
        cloud.startAction(channel, delta);
    }
        public void saveState(String state) {
        cloud.saveStatus(channel,state);
    }
    //atributos
    private int channel;
    private cloudCortina cloud;

}
