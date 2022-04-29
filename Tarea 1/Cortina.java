public class Cortina {
    //Constructor
    public Cortina(Double alfa, Double largo, int chan, int id){
        ident = id;
        canal = chan;
        vel = alfa;
        length = largo;
    }
    //Metodos
    public void applyAction(Action a){
        String command = a.getCommand();
        if(command == "U"){
            this.rollUp();
        }
        else if(command == "D"){
            this.rollDown();
        }
        else if(command == "S"){
            this.rollStop();
        }
    }    

    public double rollUp(){
        double time = 2* Math.PI*(vel);
        newLength = length - (time*vel*radio);
        if(newLength < 0){
            newLength = 0.0;
        }
        return newLength;
    }
    public double rollDown(){
        double time = 2* Math.PI*(vel);
        newLength = length - (time*vel*radio);
        if(newLength > length){
            newLength = length;
        }
        return newLength;
    }

    public double rollStop(){
        return newLength;
    }
    public String percentLength(double newLength){
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
