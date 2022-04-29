JFLAGS = -g
JC = javac
JVM= java 
FILE= "ztext.txt"

.SUFFIXES: .java .class

.java.class: \
    $(JC) $(JFLAGS) $*.java


CLASSES = \
        Action.java \
        cloud.java \
        cloudCortina.java \
        cloudLamp.java \
        Cortina.java \
        Lamp.java \
        LampControl.java \
        Operador.java \
        Proyect.java


MAIN = Proyect 


default: classes


classes: $(CLASSES:.java=.class)


run: $(MAIN).class \
    $(JVM) $(MAIN) $(FILE)

clean:\
    $(RM) *.class