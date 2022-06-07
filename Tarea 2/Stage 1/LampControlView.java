package com.example.stage1fx;

import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class LampControlView extends VBox {
    public LampControlView(LampControl lampControl) {
        Image img = new Image("D:\\rodri\\MATERIA 2022-1\\intellijproyectos\\Stage1FX\\src\\main\\java\\com\\example\\stage1fx\\rsc\\powerImage.jpg");
        ImageView button = new ImageView(img);
        control = lampControl;
        int observable;
        Spinner spinner = new Spinner(0,10,0);

        Slider sliderRed = new Slider(0,255,1);
        sliderRed.setShowTickMarks(true);
        Slider sliderGreen = new Slider(0,255,1);
        sliderGreen.setShowTickMarks(true);
        Slider sliderBlue = new Slider(0,255,1);
        sliderBlue.setShowTickMarks(true);
        button.setOnMouseClicked(e-> {
            //control.setChannel((int) spinner.getValue());
            control.pressPower();
        });
        getChildren().addAll(button,spinner,sliderRed,sliderGreen,sliderBlue);
    }

    private final LampControl control;
}

