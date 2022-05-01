import java.util.List;

public class Action{
    //constructor
    public  Action(List<String> accionesList){
    time = Integer.parseInt(accionesList.get(0));
    clase = (accionesList.get(1));
    channel = Integer.parseInt(accionesList.get(2));
    command = accionesList.get(3);
    if(accionesList.size() == 5){
        upDown = accionesList.get(4);
    }
}
    
    public int getCanal(){return channel;}

    public int getTime(){return time;}
    
    public String getCommand(){return command;}

    public String getUpDown(){return upDown;}

    public String getClase(){ return clase;}
    //atributos
    
    private int time;
    private int channel;
    private String command;
    private String upDown;
    private String clase;
}
