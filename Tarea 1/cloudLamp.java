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
            header += "LL"+String.valueOf(lamp.getId())+"\t";
        }
        return header;
    }

    public void changeLampPowerState(int canal){
        int cont = 0;
        while(cont < lamparas.size()){
            if( (lamparas.get(cont)).getChannel() == canal ){
                int j;
                for(j=0;j<lamparas.size();j++){
                    lamparas.get(j).powerOn();
                }
            }
            cont++;
        }
    }

    public void conectarNube(int canal, Action act){
        int cont = 0;
        while(cont < lamparas.size()){
            if( (lamparas.get(cont)).getChannel() == canal ){
                int j;
                for(j=0;j<lamparas.size();j++){
                    (lamparas.get(j)).applyAction(act);
                }
            }
            cont++;
        }
    }

    public int estadoLamp(int canal){
        int cont = 0;
        while(cont < lamparas.size()){
            if( lamparas.get(cont).getChannel() == canal ){
                List<Integer> estado = new ArrayList<Integer>();
                estado = lamparas.get(cont).getState();
                return(estado.get(0));
            }
            cont++;
        }
        return(-1);
    }

    //atributos
    private List<Lamp> lamparas = new ArrayList<Lamp>();
}
