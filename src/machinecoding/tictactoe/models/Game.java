package machinecoding.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Move> moves;
    private Board board;
    private List<Player> players;
    private int currentMovePlayerIndex;
    private List<WinningStrategy> winningStrategies;

    private GameStatus gameStatus;
    private Player winner;

    public Game(int dimension,List<Player> players,List<WinningStrategy> winningStrategies){
        this.moves=new ArrayList<>();
        this.board=new Board(dimension);
        this.players=players;
        this.currentMovePlayerIndex=0;
        this.winningStrategies=winningStrategies;
        this.gameStatus=GameStatus.IN_PROGRESS;
//        this.winner=null;

    }
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void setCurrentMovePlayerIndex(int currentMovePlayerIndex) {
        this.currentMovePlayerIndex = currentMovePlayerIndex;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public void setPlayer(Player winner) {
        this.winner = winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getCurrentMovePlayerIndex() {
        return currentMovePlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getPlayer() {
        return winner;
    }
}



//all attributes must be private
//have getters and setters for each
//ensures all attributes are initialized in constructor