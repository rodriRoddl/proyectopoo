public class Cortina {
    //Constructor
    public Cortina(Double alfa, Double largo, int chan, int id){
        ident = id;
        canal = chan;
        vel = alfa;
        length = largo;
    }
    //Metodos
    public void applyAction(Action a,double delta){
        String command = a.getCommand();
        if(command == "U"){
            this.rollUp(delta);
        }
        else if(command == "D"){
            this.rollDown(delta);
        }
        else if(command == "S"){
            this.rollStop(delta);
        }
    }    

    public double rollUp(double delta){
        newLength = length - (delta*vel*radio);
        if(newLength < 0){
            newLength = 0.00;
        }
        return newLength;
    }
    public double rollDown(double delta){
        newLength = length + (delta*vel*radio);
        if(newLength > length){
            newLength = length;
        }
        return newLength;
    }

    public double rollStop(double delta){
        return newLength;
    }
    public String percentLength(){
        String percent = String.valueOf(Math.round(newLength/length)*100);
        return percent;
    }

    public int getCanal(){return canal;}

    public int getId(){return ident;}

    //Atributos}
    private int ident;
    private int canal;
    private double vel;
    private double length;
    private double newLength;
    private static double radio = 0.04;
}
