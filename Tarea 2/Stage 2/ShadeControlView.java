package com.example.stage2;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ShadeControlView extends BorderPane {
    public ShadeControlView (ShadeControl sc){
        shadeControl = sc;
        Button channelButton = new Button(""+sc.getChannel());
        Button upButton = new Button("➤");
        upButton.setRotate(270);
        Button downButton = new Button("➤");
        downButton.setRotate(90);
        Button nextChannel = new Button("➤");
        Button prevChannel = new Button("➤");
        prevChannel.setRotate(180);
        channelButton.setOnAction( e-> {
            shadeControl.stop();
        });
        upButton.setOnAction(e->{
            shadeControl.startUp();
        });
        downButton.setOnAction(e->{
            shadeControl.startDown();
        });
        nextChannel.setOnAction(e->{
            ActualChannel = Integer.parseInt(channelButton.getText());
            if(ActualChannel<10)shadeControl.setChannel(ActualChannel+1);
            channelButton.setText(""+ shadeControl.getChannel());
        });
        prevChannel.setOnAction(e->{
            ActualChannel = Integer.parseInt(channelButton.getText());
            if(ActualChannel>0) shadeControl.setChannel(ActualChannel-1);
            channelButton.setText(""+ shadeControl.getChannel());
        });
        setLeft(prevChannel);
        setRight(nextChannel);
        setCenter(channelButton);
        setTop(upButton);
        setBottom(downButton);
        setAlignment(upButton, Pos.TOP_CENTER);
        setAlignment(downButton, Pos.BOTTOM_CENTER);
    }
    private int ActualChannel;
    private ShadeControl shadeControl;
}
