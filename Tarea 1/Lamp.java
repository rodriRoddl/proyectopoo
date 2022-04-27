 import java.util.ArrayList;
import java.util.List;

public class Lamp{

	//constructor
	public Lamp(int chan,int id){
		canal = chan;
		estado = "off";
		red = 255;
		green = 255;
		blue = 255;
	}

	//metodos
	public List<Integer> getState(){
		List<Integer> list = new ArrayList<Integer>();

		if(estado == "on"){
			list.add(0);
		}
		else if(estado == "off"){
			list.add(1);
		}
		list.add(red);
		list.add(green);
		list.add(blue);

		return list;
	}

	public int getChannel(){return canal;}

	public void applyAction(Action a){
		String color = a.getCommand();
		String subeBaja = a.getUpDown();
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
	}

	//atributos
	private int canal;
	private String estado;
	private int red;
	private int green;
	private int blue;
}