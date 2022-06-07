package com.example.stage1fx;

import javafx.scene.layout.Pane;

public class LampControl {
    public LampControl(int channel, Cloud c){
        this.channel= channel;
        cloud = c;
        view = new LampControlView(this);
    }
    public void pressPower(){
        cloud.changeLampPowerState(channel);
    }
    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){
        this.channel = channel;
    }
    public Pane getView() { return view;}
    private int channel;
    private Cloud cloud;
    private Pane view;
}

