import java.util.ArrayList;
import java.util.List;

// clase que contiene la cantidad de lamparas, separadas en una List de arrayList.

public class cloudLamp extends cloud{
    //constructor
    public cloudLamp(String i) {
        super(i);
    }
    //metodos
    public int getCanal(){
        return chan;
    }
    public void getLamps(List<String> list){
        int it = 0;
        while(it < getCant()){
            chan = Integer.parseInt(list.get(0+(it)));
            Lamp la = new Lamp(chan,it);
            lamparas.add(new ArrayList<Lamp>());
            lamparas.get(it).add(la);
            it++;
        }
    }
    public String getHeaders(){
        String header = "";
        for(List<Lamp> lamp: lamparas){
            header += "LL"+String.valueOf(lamp.get(-1))+"\t";
        }
        return header;
    }
    //atributos
    private int chan;
    private List<List<Lamp>> lamparas = new ArrayList<List<Lamp>>();
}
