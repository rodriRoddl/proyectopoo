~_*INTEGRANTES*_:

-Felipe Salas Ortiz / 202030544-7 / felipe.salaso@sansano.usm.cl

-Pedro Cisternas Arce / 202056597-k / pedro.cisternasa@usm.cl

-Rodrigo Lobos / 201904649-7 / rodrigo.lobosc@usm.cl

-------------------------------------------------------------------------------------------------------------------------------------

~_*DESCRIPCIÓN*_:
           
La creación de este proyecto se basa en una situacion real y que tiene como objetivo la simulación de la tecnología "Domótica" empleada en objetos cotidianos tales como lámparas y cortinas, las cuales mediante la utilizacion de un control remoto llevarían a cabo diferentes tareas, en el caso se la lampara, este puede variar sus tonalidades mediante el patron RGB, además de encendido o apagado de éste. En el caso de las cortinas, el control remoto presentaría las funciones de subir o bajar la tela, es decir extender y recojer ésta según requerimientos del usuario. El objetivo principal es la automatizacion del hogar (prioritariamente) o cualquier otro ambiente donde se implementen dichos objetos.

Para la creación de este proyecto, se incorporaron/vincularon funciones "ON/OFF" y RGB (tanto incremento como decremento de estos colores) a la lámpara, las cuales emiten diferentes senales. Estos son registrados en una "nube", encargada de conectarse con el control remoto para llevar a cabo la accion solicitada. Ocurre una situacion similar con las cortinas, la diferencia es que ahora trabajaremos con estas y en consecuencia se presentaran distintos parametros y senales, es decir que habran senales las cuales se enviaran a una "nube", y estas seran reenviadas a un control remoto, pero bien ahora este operara la extension o recogimiento de la tela.
            
Bajo ciertas limitaciones, nuestro programa no funciona con makefile en estricto rigor (a pesar de haber un intento de dentro de nuestros archivos, éste no funciona correctamente), por lo que se dejará debajo instrucciones para su compilación mediante comandos en la terminal de unix y ejecución en conjunto al archivo. A la vez, éste archivo de texto .txt mencionado puede ser alterado a disposición del usuario siempre y cuando posterior de la última linea de instrucciones tenga una linea con un ":" escrita, de no existir esta linea o existir más lineas por debajo no correspondidas, el programa no funcionará correctamente.
Al momento de ejecutarse el programa, éste leera el archivo de texto, aplicando las instrucciones que pida dentro de los códigos y devolviendo los resultados por terminal.

-------------------------------------------------------------------------------------------------------------------------------------

~_*REQUISITOS PARA USO DEL PROGRAMA*_:
            
- Sistema operativo Linux, en cualquiera de sus posibles distribuciones (ya sea de forma nativa, dual partición o emulando desde una virtual machine).
            
- Instalar Java, de preferencia la versión más reciente posible (https://www.java.com/es/download/)

-------------------------------------------------------------------------------------------------------------------------------------

~_*INSTRUCCIONES PARA COMPILAR*_:

 - Abrir terminal.
            
 - Acceder a la ubicación dónde se encuentre el archivo (cd /(ubcación de la carpeta).
            
 - Compilar el programa de la siguiente manera:
	    
       javac Action.java cloud.java cloudCortina.java cloudLamp.java Cortina.java Lamp.java LampControl.java Operador.java MainEvent.java
            
- Ejecutar el programa: 

      java MainEvent.java "ztext.txt"
