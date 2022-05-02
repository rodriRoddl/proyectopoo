import java.util.ArrayList;
import java.util.List;

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
	public int getId(){return ident;}

	public void powerOn(){
		estado = "on";
		red = 255;
		green = 255;
		blue = 255;
	}

	public void applyAction(Action a){
			if((a.getCommand()).equals("R")){
				if((a.getUpDown()).equals("U") && (red+5)<=255){
					red+=5;
				}
				else if((a.getUpDown()).equals("D") && (red-5)>=0){
					red-=5;
				}
			}
			else if((a.getCommand()).equals("G")){
				if((a.getUpDown()).equals("U") && (green+5)<=255){
					green+=5;
				}
				else if((a.getUpDown()).equals("D") && (green-5)>=0){
					green-=5;
				}
			}
			else if((a.getCommand()).equals("B")){
				if((a.getUpDown()).equals("U") && (blue+5)<=255){
					blue+=5;
				}
				else if((a.getUpDown()).equals("D") && (blue-5)>=0){
					blue-=5;
				}
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
