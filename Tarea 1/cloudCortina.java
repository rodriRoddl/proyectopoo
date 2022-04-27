import java.util.ArrayList;
import java.util.List;

// clase que contiene la cantidad de cortinas, separadas en una List de arrayList.
public class cloudCortina extends cloud{
    //constructor
    public cloudCortina(String i){
        super(i);

        }
    //metodos
    public int getCanal(){ 
        return (int) chan;
    }
    
    public void getCortinas(List<String> list){
        int it = 0;
        while(it < getCant()){
            vel = Double.parseDouble(list.get(0+(3*it)));
            len = Double.parseDouble(list.get(1+(3*it)));
            chan = Integer.parseInt(list.get(2+(3*it)));
            Cortina cort = new Cortina(vel,len,chan,it);
            cortinas.add(new ArrayList<Cortina>());
            cortinas.get(it).add(cort);
            it++;
        }
    }
    public void startUp(int channel){

    }
    public void startDown(int channel){

    }
    public void stopMove(int channel){

    }
    public String getHeaders(){
        String header = "";
        for(List<Cortina> c:cortinas){
            header += "RS"+String.valueOf(c.get(-1))+"\t";
        }
        return header;
    }
    //atributos
    private double vel;
    private double len;
    private int chan;
    private List<List<Cortina>> cortinas = new ArrayList<List<Cortina>>();
}