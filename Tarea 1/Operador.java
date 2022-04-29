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
                if(a != ":"){
                data.get(iter).add(a);
                }
            }
            iter++;
        }
    }
        public void ExecuteCommands(){
            cloudCortina cortinas = new cloudCortina(data.get(0).get(0));
            cloudLamp lamps = new cloudLamp(data.get(0).get(1));
            cortinas.getCortinas(data.get(1));
            lamps.getLamps(data.get(2));

            cant_ctrleslamp = Integer.parseInt(data.get(0).get(3));
            ctrleslamp = new ArrayList<LampControl>();
            for(int i=0;i<cant_ctrleslamp;i++){
                LampControl c = new LampControl(data.get(4).get(i),lamps);
                ctrleslamp.add(c);
            }
            cant_ctrlesCort = Integer.parseInt(data.get(0).get(2));
            ctrlesCort = new ArrayList<CortinaControl>();
            for(int i=0;i<cant_ctrlesCort;i++){
                CortinaControl cc = new CortinaControl(data.get(3).get(i),cortinas);
                ctrlesCort.add(cc);
            }

            System.out.println("Time[s]\t"+ cortinas.getHeaders() + lamps.getHeaders() );
            
            for(int it=6;it<data.size()-1;it++){
                int commandTime = Integer.parseInt(data.get(it).get(0));
                Action accion = new Action(data.get(it-1));

                while(time<commandTime){
                    if(accion.getClase() == "L"){
                        for(int k=0;k<cant_ctrleslamp;k++){
                            if( (ctrleslamp.get(k)).getChannel() == accion.getCanal() ){
                                if(ctrleslamp.get(k).getStateLamp() == 0){
                                    ctrleslamp.get(k).pressPower();
                                }
                                ctrleslamp.get(k).controlarLamp(accion);
                            }
                        }
                    }
                    /*else if(accion.getClase() == "C"){
                        for(int i=0;i<cant_ctrlesCort;i++){
                            if(ctrlesCort.get(i).getChannel() == accion.getCanal()){
                                if(ctrleslamp.get(k).getStateCort() == 0){
                                    ctresCort.get(k).
                                }
                            }
                        }


                    }
                    */
                    time+=delta;
                }
                
            }
        }
    public void getList(){System.out.println(data);}  //esto retorna la lista de listas del txt.
    
    private List<List<String>> data;
    private List<LampControl> ctrleslamp;
    private List<CortinaControl> ctrlesCort;
    private int cant_ctrleslamp, cant_ctrlesCort;
    private double time = 0.0;
    private final double delta = 0.1;
}
