package org.example;

import carRegister.CarDatabase;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static CarDatabase carDatabase = new CarDatabase();

    @Override
    public void start(Stage stage) throws IOException {
        carDatabase = new CarDatabase();
        scene = new Scene(loadFXML("primary"));
        stage.setScene(scene);
        stage.setTitle("Semesteroppgave vår 2020");
        stage.show();
        //stage.setMaximized(true);
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    static CarDatabase getCarDatabase() {
        return carDatabase;
    }

    public static void main(String[] args) {
        launch();
    }

}