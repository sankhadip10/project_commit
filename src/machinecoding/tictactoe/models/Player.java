package machinecoding.tictactoe.models;

import java.util.Scanner;

public class Player {
    private Symbol symbol;
    private String name;
    private PlayerType playerType;

    private Scanner scanner;
    public Player(Symbol symbol, String name, PlayerType playerType) {
        this.symbol = symbol;
        this.name = name;
        this.playerType = playerType;
        this.scanner=new Scanner(System.in);
    }
    public Cell makeMove(Board board){
        System.out.println("Please tell row number (starting from 0)");
        int row = scanner.nextInt();;

        System.out.println("Please tell co number (starting from 0)");
        int col=scanner.nextInt();


        return new Cell(row,col);
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }
}
