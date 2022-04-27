import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operador {
    public Operador(Scanner doc){
        Scanner docu = doc;
        data = new ArrayList<List<String>>();
        int iter = 0;
        while(docu.hasNextLine()){
            String linea = docu.nextLine();
            String[] split = linea.split("\t");
            data.add(new ArrayList<String>());
            for(String a: split){
                data.get(iter).add(a);
            }
            iter++;
        }
    }
        public void ExecuteCommands(){
            cloudCortina cortinas = new cloudCortina(data.get(0).get(0));
            cloudLamp lamps = new cloudLamp(data.get(0).get(1));
            cortinas.getCortinas(data.get(1));
            lamps.getLamps(data.get(2));
            for(int it = 5;it<data.size()-it;it++){
                int commandTime = Integer.parseInt(data.get(it).get(0));
                while(time<commandTime){
                    
                    time+=delta;
                }
            }
        }
    public void getList(){System.out.println(data);}  //esto retorna la lista de listas del txt.
    private List<List<String>> data;
    private double time = 0.0;
    private final double delta = 0.1;
}
