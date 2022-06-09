package com.example.stage3;

import javafx.scene.layout.BorderPane;

public class ShadeControl extends DomoticDeviceControl{
    public ShadeControl(int channel, Cloud c){
        super(channel,c);
        this.channel= channel;
        cloud = c;
        view = new ShadeControlView(this);
    }
    public BorderPane getView() {return view;}
    public void startUp(){
        cloud.startShadeUp(channel);
    }
    public void startDown(){
        cloud.startShadeDown(channel);
    }
    public void stop(){
        cloud.stopShade(channel);
    }
    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){ this.channel = channel;}
    private ShadeControlView view;
    private int channel;
}
