package com.example.stage2;

public class LampControl extends DomoticDeviceControl{
    public LampControl(int channel, Cloud c){
        super(channel,c);
        this.channel= channel;
        cloud = c;
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
    private int channel;
    private Cloud cloud;
}
