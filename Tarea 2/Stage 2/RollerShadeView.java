package com.example.stage2;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class RollerShadeView extends Group {
    public RollerShadeView(double maxLength, double width, double length, double radius, Color color) {
        this.maxLength = maxLength;
        Rectangle background = new Rectangle(5,5, width-10,maxLength-5); //(pos x, pos y, tamaño ancho, tamaño largo)
        background.setFill(Color.BLUE);
        getChildren().add(background);
        cloth = new Rectangle (5,5,width,maxLength);
        cloth.setFill(color);
        getChildren().add(cloth);

        // Rolled up shade cloth
        Ellipse rightSide = new Ellipse(width, radius,radius/2,radius);
        Ellipse leftSide = new Ellipse(10, radius,radius/2,radius);
        rightSide.setFill(color);
        rightSide.setStroke(Color.BLACK);
        leftSide.setFill(color);
        leftSide.setStroke(Color.BLACK);
        Line roller = new Line(10,5-radius,width,5-radius);
        roller.setFill(Color.BLACK);
        getChildren().addAll(leftSide,rightSide,roller);
    }
    public void setLength(double length){
            cloth.setHeight(length);
        // ¿?
    }
    private Rectangle cloth;
    private final double maxLength;
}
