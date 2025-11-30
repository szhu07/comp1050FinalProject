package com.example.finalprojectrockpaperscissior;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/example/finalprojectrockpaperscissior/GameView.fxml")
        );

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Rock Paper Scissors");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}