public class Lamp{

	//constructor
	public Lamp(int chan,int id){
		ident = id;
		canal = chan;
		estado = "off";
		red = 0;
		green = 0;
		blue = 0;
	}

	//metodos
	public String getState(){
		String state = "";
		state += (red+"\t"+green+"\t"+blue);
		return state;
	}

	public int getChannel(){return canal;}
	public int getId(){return ident;}

	public void powerOn(){
		estado = "on";
		red = 255;
		green = 255;
		blue = 255;
	}

	public void applyAction(Action a,double delta){
		double Timer = 0;
		String color = a.getCommand();
		String subeBaja = a.getUpDown();
		while(Timer < a.getTime()){
			if(color=="R" && red>=0 && red<=255){
				if(subeBaja == "U"){
					red+=5;
				}
				else if(subeBaja == "D"){
					red-=5;
				}
			}
			else if(color=="G" && green>=0 && green<=255){
				if(subeBaja=="U"){
					green+=5;
				}
				else if(subeBaja=="D"){
					green-=5;
				}
			}
			else if(color=="B" && blue>=0 && blue<=255){
				if(subeBaja=="U"){
					blue+=5;
				}
				else if(subeBaja=="D"){
					blue-=5;
				}
			}
		Timer += delta;
		}
	}

	//atributos
	private int ident;
	private int canal;
	private String estado;
	private int red;
	private int green;
	private int blue;
}