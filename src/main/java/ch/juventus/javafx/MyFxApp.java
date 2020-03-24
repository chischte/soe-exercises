package ch.juventus.javafx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

// ACHTUNG: LÄUFT NUR AUF SDK 11.05 !!!!!

public class MyFxApp extends Application {
    public static final String PROJECT_PATH = "file:///C:/Users/realslimshady/Documents/GitHub/soe-exercises/";
    public static final String LAYOUT_PATH = "src/main/java/ch/juventus/javafx/myLayout.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception {

        MyFxController controller = new MyFxController();

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(new URL(PROJECT_PATH + LAYOUT_PATH));
        loader.setController(controller);
        GridPane grid = loader.load();
        primaryStage.setTitle("Primary Stage");
        Scene scene = new Scene(grid, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
