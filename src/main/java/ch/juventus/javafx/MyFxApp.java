
package ch.juventus.javafx;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyFxApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text();
        text.setFont(new Font(45));
        text.setX(50);
        text.setY(150);
        text.setText("Hello World");

        VBox root = new VBox(20);
        ObservableList list = root.getChildren();
        list.add(text);

        Scene scene = new Scene(root, 600, 300);

        primaryStage.setTitle("Hello World Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}

