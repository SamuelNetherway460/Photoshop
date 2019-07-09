/* Samuel Netherway 955794 */
/* This is my own work */

package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Parent rootNode;
    private static Stage primaryStage;

    public void start(Stage stage) throws Exception {

        primaryStage = stage;
        primaryStage.setTitle("Photoshop");
        primaryStage.setScene(new Scene(rootNode));
        primaryStage.show();

    }

    public void init() throws Exception {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("views/Photoshop.fxml"));
        rootNode = loader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return primaryStage;
    }

    public static void setScene(Scene s) {
        primaryStage.setScene(s);
    }
}
