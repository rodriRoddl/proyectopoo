

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
public class RollerShadeView extends Group {
    public RollerShadeView(double maxLength, double width, double radius, Color color) {
        this.maxLength = maxLength;
        Media media = new Media(MEDIA_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.setVolume(0.1);
        mediaPlayer.play();
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaView.setFitHeight(2*(maxLength)-10);
        mediaView.setFitWidth(2*(width-5));
        mediaView.setX(10);
        mediaView.setY(5);
        mediaView.setPreserveRatio(false);
        getChildren().addAll(mediaView);
        cloth = new Rectangle (5,5,2*width,2*maxLength);
        cloth.setFill(color);
        getChildren().add(cloth);

        // Rolled up shade cloth
        Ellipse rightSide = new Ellipse(2*width, radius,radius/2,radius);
        Ellipse leftSide = new Ellipse(10, radius,radius/2,radius);
        rightSide.setFill(color);
        rightSide.setStroke(Color.BLACK);
        leftSide.setFill(color);
        leftSide.setStroke(Color.BLACK);
        Line roller = new Line(10,5-radius,2*width,5-radius);
        roller.setFill(Color.BLACK);
        getChildren().addAll(leftSide,rightSide,roller);
    }
    public void setLength(double length){
            cloth.setHeight(2*(maxLength-length));
    }
    private Rectangle cloth;
    private final double maxLength;
    private static final String MEDIA_URL = "http://profesores.elo.utfsm.cl/~agv/elo329/1s22/Assignments/20220430_101027.mp4";
}
