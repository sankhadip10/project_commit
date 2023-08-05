package machinecoding.tictactoe.controller;

import machinecoding.tictactoe.models.Game;
import machinecoding.tictactoe.models.GameStatus;
import machinecoding.tictactoe.models.Player;
import machinecoding.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(int dimension,
                           List<Player> players,
                           List<WinningStrategy> winningStrategies){

        return  Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void displayBoard(Game game){
        game.printBoard();

    }

    public void undo(Game game){


    }

    public void makeMove(Game game){

    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void printWinner(Game game){

    }

    public void printResult(Game game) {
    }
}
