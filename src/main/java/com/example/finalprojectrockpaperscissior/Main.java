package com.example.finalprojectrockpaperscissior;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public void start(Stage stage) {
        GameController controller = new GameController();
        GameView view = new GameView();

        Scene scene = view.createScene(controller);

        stage.setScene(scene);
        stage.setTitle("Rock Paper Scissors");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
