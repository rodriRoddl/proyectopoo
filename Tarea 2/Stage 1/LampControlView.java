import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class LampControlView extends VBox {
    public LampControlView(LampControl lampControl) {
        Image img = new Image("powerImage.jpg");
        ImageView button = new ImageView(img);
        control = lampControl;
        Spinner spinner = new Spinner(0,10,0);
        Slider sliderRed = new Slider(0,255,1);
        sliderRed.setShowTickMarks(true);
        Slider sliderGreen = new Slider(0,255,1);
        sliderGreen.setShowTickMarks(true);
        Slider sliderBlue = new Slider(0,255,1);
        sliderBlue.setShowTickMarks(true);
        button.setOnMouseClicked(e-> {
            control.setChannel((int) spinner.getValue());
            control.pressPower();
        });
        sliderRed.setOnMouseDragged(e->{
            r = (short) sliderRed.getValue();
            control.changeRed(r);
        });
        sliderGreen.setOnMouseDragged(e->{
            g = (short) sliderGreen.getValue();
            control.changeGreen(g);
        });
        sliderBlue.setOnMouseDragged(e->{
            b = (short) sliderBlue.getValue();
            control.changeBlue(b);
        });
        getChildren().addAll(button,spinner,sliderRed,sliderGreen,sliderBlue);
    }

    private final LampControl control;
    private short r,g,b;
}

