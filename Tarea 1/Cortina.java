public class Cortina {
    //Constructor
    public Cortina(Double alfa, Double largo, int chan, int id){
        ident = id;
        canal = chan;
        vel = alfa;
        maxLength = largo;
    }
    //Metodos
    public void applyAction(Action a,double delta){
        String command = a.getCommand();
        if(command.equals("U")){
            this.rollUp(delta);
        }
        else if(command.equals("D")){
            this.rollDown(delta);
        }
        else if(command.equals("S")){
            this.rollStop(delta);
        }
        else{
            System.out.println("comando no reconocido, no se puede seguir con el programa");
            System.exit(-1);
        }
    }   
    public double rollUp(double delta){
        length -= (delta*vel*radio);
        if(length < 0){
            length = 0.00;
        }
        return length;
    }
    public double rollDown(double delta){
        length += (delta*vel*radio);
        if(length > maxLength){
            length = maxLength;
        }
        return length;
    }

    public double rollStop(double delta){
        return length;
    }
    public String percentLength(){
        String percent = String.valueOf(Math.round(length/maxLength)*100);
        return percent;
    }

    public int getCanal(){return canal;}

    public int getId(){return ident;}

    //Atributos
    private int ident;
    private int canal;
    private double vel;
    private double length;
    private final double maxLength;
    private static double radio = 0.04;
}
