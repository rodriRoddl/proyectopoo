package com.example.stage2;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ShadeControlView extends BorderPane {
    public ShadeControlView (ShadeControl sc){
        ShadeControl shadeControl = sc;
        Button channelButton = new Button(""+sc.getChannel());
        Button upButton = new Button();
        channelButton.setOnAction( e-> {
            //¿?
        });
        setCenter(channelButton);
        // ¿?
    }
}
