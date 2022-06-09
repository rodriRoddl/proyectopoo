package com.example.stage3;
import java.util.ArrayList;
public class Cloud {
    public Cloud() {
        lamps = new ArrayList<Lamp>();
    }
    public void addLamp(Lamp l) {
        lamps.add(l);
    }
    public Lamp getLampAtChannel(int channel) {
        for (Lamp l : lamps)
            if (l.getChannel() == channel)
                return l;
        return null;
    }

    public void changeLampPowerState(int channel) {
        Lamp l = getLampAtChannel(channel);
        if (l != null) l.changePowerState();
    }
    public void changeRed(short r, int channel){
        Lamp l=getLampAtChannel(channel);
        if (l != null) l.changeRed(r);
    }
    public void changeGreen(short g,int channel){
        Lamp l=getLampAtChannel(channel);
        if (l != null) l.changeGreen(g);
    }
    public void changeBlue(short b,int channel){
        Lamp l=getLampAtChannel(channel);
        if (l != null) l.changeBlue(b);
    }
    private ArrayList<Lamp> lamps;

}


