JFLAGS = -g
JC = javac
JVM = java
JVM2 = --module-path $(JavaFX) --add-modules javafx.controls,javafx.fxml
MAIN = Stage1

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $(JVM2) $*.java

CLASSES = \
				Cloud.java\
                Lamp.java\
          		LampControl.java\
          		LampControlView.java\
          		LampState.java\
          		LampView.java\
          		Stage1.java


MAIN = Stage1

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) $(JVM2) $(MAIN)
clean:
	del "*.class"
	del ".\Classes\*.class"