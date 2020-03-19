package ch.juventus.javafx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

// ACHTUNG: LÄUFT NUR AUF SDK 11.05 !!!!!

public class MyFxApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        MyFxController controller = new MyFxController();

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(new URL("file:///C:/Users/realslimshady/Documents/GitHub/soe-exercises/src/main/java/ch/juventus/javafx/myLayout.fxml"));
        loader.setController(controller);
        GridPane grid = loader.load();
        primaryStage.setTitle("Option 1");
        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
