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
        length = 0;
        while(status == "U" || status == "D" || status =="S"){
            if(status =="U"){
                length -= this.increment(delta);
                if(length < 0){
                    length = 0.0;
                }
            }
            else if(status == "D"){
                length += this.increment(delta);
                if(length > maxLength){
                    length = maxLength;
                }
            }
            else if(status == "S"){
                break;
            }
        
        }
    }

    public void UpdateState(String state){
        status = state;
    }
    public double increment(double delta){
        double increment = delta*vel*radio;
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
