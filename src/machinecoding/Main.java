package machinecoding;

import machinecoding.tictactoe.controller.GameController;
import machinecoding.tictactoe.models.Game;
import machinecoding.tictactoe.models.GameStatus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create a game
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);
        Game game;
        try {
           game =gameController.createGame();

        } catch (Exception e){
            System.out.println("Something went wrong");
            return;
        }
        //while game status in progress
        while (gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            //print board
            gameController.displayBoard(game);
            //print if undo
            System.out.println("Do you want to undo?(y/n");
            /* if yes -->call undo */
            String input = scanner.next();
            if(input.equalsIgnoreCase("y")){
                gameController.undo(game);
            }else {
                //move next player
                gameController.makeMove(game);
            }

        }

        gameController.printResult(game);
        //if winner-> print winner


    }
}
