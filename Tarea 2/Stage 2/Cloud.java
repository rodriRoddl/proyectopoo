package com.example.stage2;
import java.util.ArrayList;
public class Cloud {
    public Cloud() {
        lamps = new ArrayList<Lamp>();
        rollerShades = new ArrayList<RollerShade>();
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
    public void addRollerShade(RollerShade rs){
        rollerShades.add(rs);
    }
    public RollerShade getRsAtChannel(int channel){
        for (RollerShade rs: rollerShades)
            if(rs.getChannel() == channel)
                return rs;
        return null;
    }
    public void startShadeUp(int channel) {
        RollerShade rs = getRsAtChannel(channel);
        if(rs!=null) rs.startUp();
    }
    public void startShadeDown(int channel) {
        RollerShade rs = getRsAtChannel(channel);
        if(rs!=null) rs.startDown();
    }
    public void stopShade(int channel) {
        RollerShade rs = getRsAtChannel(channel);
        if(rs!=null) rs.stop();
    }
    private ArrayList<Lamp> lamps;
    private ArrayList<RollerShade> rollerShades;

}


