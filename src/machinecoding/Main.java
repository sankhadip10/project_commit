package machinecoding;

import machinecoding.tictactoe.controller.GameController;
import machinecoding.tictactoe.models.*;
import machinecoding.tictactoe.strategies.winningstrategies.OrderOneColumnWinningStrategy;
import machinecoding.tictactoe.strategies.winningstrategies.OrderOneDiagonalWinningStrategy;
import machinecoding.tictactoe.strategies.winningstrategies.OrderOneRowWinningStrategy;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create a game
        GameController gameController = new GameController();
        Scanner scanner = new Scanner(System.in);
        Game game;
        try {
           game =gameController.createGame(
                   3,
                   List.of(
                           new Player(new Symbol('X'),"Ricky", PlayerType.HUMAN),
                           new Bot(new Symbol('0'),"Aman",BotDifficultyLevel.EASY )
                   ),
                   List.of(
                           new OrderOneColumnWinningStrategy(),
                           new OrderOneDiagonalWinningStrategy(),
                           new OrderOneRowWinningStrategy())
           );

        } catch (Exception e){
            System.out.println("Something went wrong");
            return;
        }
        System.out.println("------------Game is Starting---------------");
        //while game status in progress
        while (gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            System.out.println("This is how board looks like:");
            //print board
            gameController.displayBoard(game);
            //print if undo
            System.out.println("Does any one  want to undo?(y/n");
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
