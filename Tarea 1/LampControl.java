public class LampControl {
    public LampControl(String canal,cloudCortina c){
        channel = Integer.parseInt(canal);
        cortina = c;
    }
    public int getChannel(){return channel;}
    public void PowerState(){
        
    }
    private int channel;
    private cloudCortina cortina;
}
