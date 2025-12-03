package com.example.finalprojectrockpaperscissior;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GameController {

    public Label playerMoveLabel;
    public Label computerMoveLabel;
    public Label roundResultLabel;
    public Label scoreLabel;
    public Label finalMessageLabel;

    private GameLogic logic = new GameLogic();

    @FXML
    public void onRock() {
        playRound(Move.ROCK);
    }

    @FXML
    public void onPaper() {
        playRound(Move.PAPER);
    }

    @FXML
    public void onScissors() {
        playRound(Move.SCISSORS);
    }

    private void playRound(Move playerMove) {
        if (logic.isGameOver()) return;

        Move computerMove = logic.getComputerMove();
        String result = logic.determineWinner(playerMove, computerMove);

        playerMoveLabel.setText("You chose: " + playerMove);
        computerMoveLabel.setText("Computer chose: " + computerMove);
        roundResultLabel.setText(result);

        scoreLabel.setText("Score → You: " + logic.getPlayerScore()
                + " | Computer: " + logic.getComputerScore());

        if (logic.isGameOver()) {
            finalMessageLabel.setText(logic.getFinalWinner());
        }
    }
}
