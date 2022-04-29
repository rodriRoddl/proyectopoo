import java.util.ArrayList;
import java.util.List;

// clase que contiene la cantidad de cortinas, separadas en una List de arrayList.
public class cloudCortina extends cloud{
    //constructor
    public cloudCortina(String i){
        super(i);

        }
    //metodos
    public void getCortinas(List<String> list){
        int it = 0;
        while(it < getCant()){
            double vel = Double.parseDouble(list.get(0+(3*it)));
            double len = Double.parseDouble(list.get(1+(3*it)));
            int chan = Integer.parseInt(list.get(2+(3*it)));
            Cortina cort = new Cortina(vel,len,chan,it);
            cortinas.add(cort);
            it++;
        }
    }

    public void startAction(int channel,Action action,double delta){
        for(Cortina cort : cortinas){
            if(cort.getCanal() == channel){
                cort.applyAction(action,delta);
            }
        }
    }
    public String getStatus(){
        String Status = "";
        for(Cortina cort: cortinas){
            Status += cort.percentLength()+"\t";
        }
        return Status;
    }
    public String getHeaders(){
        String header = "";
        for(Cortina c : cortinas){
            header += "RS"+String.valueOf(c.getId())+"\t";
        }
        return header;
    }

    //atributos
    private List<Cortina> cortinas = new ArrayList<Cortina>();
}