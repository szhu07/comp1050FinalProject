package com.example.finalprojectrockpaperscissior;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class GameView {

    public Scene createScene(GameController controller) {

        // Title
        Label title = new Label("Rock - Paper - Scissors");
        title.setStyle("-fx-font-size: 24; -fx-font-weight: bold;");

        // Buttons inside HBox
        Button rockBtn = new Button("Rock");
        Button paperBtn = new Button("Paper");
        Button scissorsBtn = new Button("Scissors");

        rockBtn.setOnAction(e -> controller.onRock());
        paperBtn.setOnAction(e -> controller.onPaper());
        scissorsBtn.setOnAction(e -> controller.onScissors());

        HBox buttonBox = new HBox(10, rockBtn, paperBtn, scissorsBtn);
        buttonBox.setAlignment(Pos.CENTER);

        // Labels — wired directly to the controller
        controller.playerMoveLabel = new Label("You chose:");
        controller.computerMoveLabel = new Label("Computer chose:");
        controller.roundResultLabel = new Label("Round result:");
        controller.scoreLabel = new Label("Score → You: 0 | Computer: 0");

        controller.finalMessageLabel = new Label("");
        controller.finalMessageLabel.setStyle("-fx-font-size: 18; -fx-font-weight: bold;");

        // Outer VBox
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(
                title,
                buttonBox,
                controller.playerMoveLabel,
                controller.computerMoveLabel,
                controller.roundResultLabel,
                controller.scoreLabel,
                controller.finalMessageLabel
        );

        return new Scene(root, 450, 400);
    }
}

