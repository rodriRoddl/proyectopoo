import java.util.ArrayList;
import java.util.List;

// clase que contiene la cantidad de lamparas, separadas en una List de arrayList.

public class cloudLamp extends cloud{
    //constructor
    public cloudLamp(String i) {
        super(i);
    }
    //metodos
    public void getLamps(List<String> list){
        int it = 0;
        while(it < getCant()){
            int chan = Integer.parseInt(list.get(0+(it)));
            Lamp la = new Lamp(chan,it);
            lamparas.add(la);
            it++;
        }
        //System.out.println( ((lamparas.get(0).get(0)).getState()).get(0) );
    }
    
    public String getHeaders(){
        String header = "";
        for(Lamp lamp: lamparas){
            header += "RL_"+String.valueOf(lamp.getId())+"\t"+"GL_"+String.valueOf(lamp.getId())+"\t"+"BL_"+String.valueOf(lamp.getId())+"\t";
        }
        return header;
    }

    public void changeLampPowerState(int canal){
        for(Lamp l:lamparas){
            if(l.getChannel() == canal){
                l.powerOn();
            }
        }
    }

    public void conectarNube(int canal, Action act){
        for(Lamp la: lamparas){
            if(la.getChannel() == canal){
                la.applyAction(act);
            }
        }
    }

    public String getStatus(){
        String Status = "";
        for(Lamp la: lamparas){
            Status += la.getState()+"\t";
        }
        return Status;
    }

    //atributos
    private List<Lamp> lamparas = new ArrayList<Lamp>();
}
