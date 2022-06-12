JFLAGS = -g
JC = javac
JVM = java
JVM2 = --module-path $(JavaFX) --add-modules javafx.controls,javafx.fxml,javafx.media
MAIN = Stage4

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $(JVM2) $*.java

CLASSES = \
				Cloud.java\
				DomoticDevice.java\
				DomoticDeviceControl.java\
                Lamp.java\
          		LampControl.java\
          		LampState.java\
          		RollerShade.java\
          		RollerShadeView.java\
          		ShadeControl.java\
          		ShadeControlView.java\
          		Stage4.java


MAIN = Stage4

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class
	$(JVM) $(JVM2) $(MAIN)
clean:
	del "*.class"
	del ".\Classes\*.class"