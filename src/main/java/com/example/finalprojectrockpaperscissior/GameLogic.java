package com.example.finalprojectrockpaperscissior;

import java.util.Random;

public class GameLogic {

    private int playerScore = 0;
    private int computerScore = 0;
    private Random random = new Random();

    public Move getComputerMove() {
        Move[] moves = Move.values();
        return moves[random.nextInt(moves.length)];
    }

    public String determineWinner(Move player, Move computer) {
        if (player == computer) {
            return "It's a tie!";
        }

        boolean playerWins =
                (player == Move.ROCK && computer == Move.SCISSORS) ||
                        (player == Move.PAPER && computer == Move.ROCK) ||
                        (player == Move.SCISSORS && computer == Move.PAPER);

        if (playerWins) {
            playerScore++;
            return "You win this round!";
        } else {
            computerScore++;
            return "Computer wins this round!";
        }
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public boolean isGameOver() {
        return playerScore == 2 || computerScore == 2;
    }

    public String getFinalWinner() {
        if (playerScore > computerScore) return "🎉 YOU WIN THE GAME!";
        return "🙁 COMPUTER WINS THE GAME!";
    }

    public void reset() {
        playerScore = 0;
        computerScore = 0;
    }
}
