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
        System.out.println(data);
    }
        public void ExecuteCommands(){
            cloudCortina cortinas = new cloudCortina(data.get(0).get(0)); // guardamos el cloud de cortinas
            cloudLamp lamps = new cloudLamp(data.get(0).get(1));          //guardamos el cloud de lamparas
            cortinas.getCortinas(data.get(1));                                  //se ven la cantidad de cortinas que se guardaran en el cloud
            lamps.getLamps(data.get(2));                                        //se ve la cantidad de lamparas que se guardaran en su cloud

            cant_ctrleslamp = Integer.parseInt(data.get(0).get(3)); // cantidad de controles de lampara
            ctrleslamp = new ArrayList<LampControl>();                           //hacemos un arraylist para guardar el canal de la cantidad de controles de lamparas que haya
            for(int i=0;i<cant_ctrleslamp;i++){
                LampControl c = new LampControl(data.get(4).get(i),lamps);
                ctrleslamp.add(c);                                               //en este operador se guardan
            }
            cant_ctrlesCort = Integer.parseInt(data.get(0).get(2));         //hacemos lo mismo de arriba pero ahora con los controles de cortina
            ctrlesCort = new ArrayList<CortinaControl>();
            for(int i=0;i<cant_ctrlesCort;i++){
                CortinaControl cc = new CortinaControl(data.get(3).get(i),cortinas);
                ctrlesCort.add(cc);
            }

            System.out.println("Time[s]\t"+ cortinas.getHeaders() + lamps.getHeaders() ); //empezamos a imprimir la cabecera de salida
            
            for(int it=5;it<data.size()-1;it++){                                            //recorremos las acciones
                int commandTime = Integer.parseInt(data.get(it).get(0));
                Action accion = new Action(data.get(it));

                while(time<commandTime){                                                     //este ciclo nos sirve para entregar los estados cada 0.1 seg. de cada objeto
                    if(accion.getClase() == "L"){                                           //vemos si la accion corresponde a L de lamparas para accionarla.
                        for(int k=0;k<cant_ctrleslamp;k++){
                            if( (ctrleslamp.get(k)).getChannel() == accion.getCanal() ){
                                if(ctrleslamp.get(k).getStateLamp() == 0){
                                    ctrleslamp.get(k).pressPower();
                                }
                                ctrleslamp.get(k).controlarLamp(accion);
                            }
                        }
                    }
                    else if(accion.getClase() == "C"){                                     //se ve si la accion corresponde a C de cortinas para accionar.
                        for(int i=0;i<cant_ctrlesCort;i++){
                            if(ctrlesCort.get(i).getChannel() == accion.getCanal()){
                                ctrlesCort.get(i).conectAction(accion,delta);
                            }

                        }
                    }
                    System.out.println(String.format("%.1f",time)+cortinas.estado());
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
