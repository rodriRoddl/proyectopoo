
public class Cortina {
    //Constructor
    public Cortina(Double alfa, Double largo, int chan, int id){
        ident = id;
        canal = chan;
        vel = alfa;
        maxLength = largo;
    }
    //Metodos
    public void applyAction(double delta){
        if(status.equals("U")){
            length -= this.increment(delta);
            if(length < 0){
                length = 0.0;
            }
        }
        if(status.equals("D")){
            length += this.increment(delta);
            if(length > maxLength){
                length = maxLength;
            }
        }
        if(status.equals("S")){
        }
    }

    public void saveState(String state){
        status = state;
    }
    public double increment(double delta){
        double increment = (delta*vel*radio);
        return increment;
    }
    public String getState(){
        String percent = String.valueOf(Math.round(length/maxLength)*100);
        return percent;
    }

    public int getCanal(){return canal;}

    public int getId(){return ident;}

    //Atributos
    private String status;
    private int ident;
    private int canal;
    private double vel;
    private final double maxLength;
    private double length;
    private static double radio = 0.04;
}
