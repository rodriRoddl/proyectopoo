import java.io.File;
import java.util.Scanner;

public class MainEvent{
    public static void main(String[] args)throws Exception{
        File docFile = new File("./ztext.txt");
        Scanner docu = new Scanner(docFile);
        //empezamos a leer el txt.
        Operador o = new Operador(docu);
        o.getList(); // obtiene la lista de el txt
        o.ExecuteCommands(); //ejecuta los comandos, es decir las acciones para los objetos
        docu.close(); // se debe cerrar el archivo por buena practica.
    }
}
