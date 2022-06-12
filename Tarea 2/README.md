~_*INTEGRANTES*_:

-Felipe Salas Ortiz / 202030544-7 / felipe.salaso@sansano.usm.cl

-Pedro Cisternas Arce / 202056597-k / pedro.cisternasa@usm.cl

-Rodrigo Lobos / 201904649-7 / rodrigo.lobosc@usm.cl

-------------------------------------------------------------------------------------------------------------------------------------

~_*DESCRIPCIÓN*_:
           
	La creación de este proyecto busca adaptar y extender uno pasado, en el cual se elaboró un sistema domótico que abarca una cortina con la función de extender y recogerse mediante un control remoto, ademas de este, existe una lampara con funcionalidad de encender-apagarse, junto con el cambio de tonalidad (tanto aumento como decremento dentro del rango 0-255) mediante el formato RGB, todo esto enlazado a un único dispositivo remoto. 
	
	En este avance se simula gráficamente ambos modelos domóticos antes mencionado. Para el caso de la cortina, esta presenta un modelo simple, con un motor capaz de girar en ambas direcciones y una tela. Esta cortina lleva asociado un control remoto con botones de envío de mensajes "Up", "Down" y "Stop". Las funciones "Up" y "Down" cumplen la función de contraer y extender la tela respectivamente, y para el caso de "Stop", detendrá todo tipo de movimiento que se este realizando en tiempo real. Cada uno de los controles remotos mencionados, están vinculados a un canal de cortina. Con este se define que cortina puede controlar. El estado inicial de las cortinas se llama "Nacer", este se determina al ser instaladas y viene dado por el enrollamiento total de esta, también denominado 100% abierta.

	Presionar el botón "Up", significara subir la cortina. Dada tal instrucción el motor comienza a girar en sentido correspondiente al que por consecuencia la tela se comience a enrollar. Detener dicha acción se determina con botón "Stop" (o en su defecto detener la presión en este boton). Este tipo de cortinas tiene sensores de "Termino", que detiene el movimiento del motor cuando la tela esta completamente extendida, o estando completamente enrollada.

	Por otra parte esta la lampara, también controlada mediante botones de emisión de mensaje, en este caso se presenta un único botón "On", "Off", ilustrado por el típico símbolo de encendido y apagado. La luz emitida por lampara se compone de tres colores básicos, siendo estos verde, rojo y azul, representados por "G", "R" y "B" respectivamente. Cada uno de estos valores presenta una intensidad fluctuante entre 0-255. Cuando una lampara es instalada ("Nace"), comienza apagada y con valores de intensidades de 255 para cada color. 

	Cada lámpara tiene un canal asociado el cual no se mezcla con los canales de cortinas, es decir estos son independientes del otro. Un control de lampara asociado a un canal, controlará todas las lámparas que esté vinculado a ese canal. Además cada control permite el intercambio de canal, con el propósito de poder controlar la lampara que desee en función de su decisión. Este canal es reflejado justamente debajo del botón de encendido, representado con un número (correspondiente al número del canal que esté vinculado en ese instante).
	
	Iniciar actividad corresponde a encender la lámpara (Asociado a botón de mensaje "Power"), ésta reanudará intensidades de colores previos a ser apagada por última vez. Pausar actividad (apagar lámpara) resulta de presionar nuevamente dicho botón de señal, una vez prendida ésta.

-------------------------------------------------------------------------------------------------------------------------------------

~_*REQUISITOS PARA USO DEL PROGRAMA*_:
            
- Instalar Java, de preferencia la versión más reciente posible (https://www.java.com/es/download/)

- Junto con Java, se necesita su librería "JavaFX" o una ID en la cual poder trabajar con esta libreria, ya sea NetBeans, IntelliJ, entre otras a elección.

-------------------------------------------------------------------------------------------------------------------------------------

~_*INSTRUCCIONES PARA USO DEL PROGRAMA*_:

En el caso de sistemas operativos basados en Linux, podemos:

 - Abrir terminal.
            
 - Acceder a la ubicación dónde se encuentre el archivo (cd /(ubcación de la carpeta).
            
 - Compilar el programa de la siguiente manera para Stage 1 o 3:
	    
       javac Cloud.java Lamp.java LampControl.java LampControlView.java LampState.java LampView.java StageX.java
       
O de la siguiente otra forma para Stage 2 o 4:
   
	javac Cloud.java DomoticDevice.java DomoticDeviceControl.java Lamp.java LampControl.java LampState.java RollerShade.java RollerShadeView.java ShadeControl.java ShadeControlView.java StageX.java
            
- Ejecutar el programa: 

      java StageX
      
_(Notar que tanto para compilación como ejecución se debe reemplazar la "X" por el número de Stage correspondiente)._

La otra alternativa sería hacer uso de los _Makefile_ entregados por cada stage, a través de la siguiente linea comando:

	make javaFX= "ruta de javasdk\lib"
