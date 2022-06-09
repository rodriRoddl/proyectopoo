
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Stage3 extends Application {
    public void start(Stage primaryStage) {
        int lampChannel=2, lampChannelTwo =3;
        Cloud cloud = new Cloud();
        Lamp lamp = new Lamp(lampChannel);
        Lamp lamp2 = new Lamp(lampChannelTwo);
        cloud.addLamp(lamp);
        cloud.addLamp(lamp2);
        LampControl lampControl = new LampControl(-1, cloud);
        HBox hBox = new HBox(40);
        hBox.setPadding(new Insets(40));
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(lamp.getView(),lamp2.getView(), lampControl.getView());
        hBox.setFillHeight(false);
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(100));
        pane.setBottom(hBox);
        Scene scene = new Scene(pane, 650, 600);
        primaryStage.setTitle("Domotic Devices Simulator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
