public class Cortina {
    //Constructor
    public Cortina(Double alfa, Double largo, int chan, int id){
        ident = id;
        canal = chan;
        vel = alfa;
        maxLength = largo;
        length = maxLength;
    }
    //Metodos
    public void applyAction(Action a,double delta){ //carga estado subiendo o bajando o nada 
        String command = a.getCommand();
        //while(){
            if(command.equals("U")){
                length -= this.increment(delta);
                if(length < 0){
                    length = 0.0;
                }
            }
            else if(command.equals("D")){
                length += this.increment(delta);
                if(length > maxLength){
                    length = maxLength;
                }
            }
            else if(command.equals("S")){
            }
            else{
                System.out.println("comando no reconocido, no se puede seguir con el programa");
                System.exit(-1);
            }
        //}
    }

    public String UpdateState(){
        return "none";
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
    private int ident;
    private int canal;
    private double vel;
    private final double maxLength;
    private double length;
    private static double radio = 0.04;
}
