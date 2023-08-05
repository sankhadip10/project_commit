package machinecoding.tictactoe.models;
import machinecoding.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Game {
    private List<Move> moves;
    private Board board;
    private List<Player> players;
    private int currentMovePlayerIndex;
    private List<WinningStrategy> winningStrategies;

    private GameStatus gameStatus;
    private Player winner;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Game(int dimension,List<Player> players,List<WinningStrategy> winningStrategies){
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

    public void printBoard(){
       this.board.print();
    }

    public static class Builder{
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private int dimension;

        private Builder(){}

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        private boolean valid(){
            if(this.players.size()<2){
                return false;
            }
            if(this.players.size()!=this.dimension-1){
                return false;
            }
            int botCount=0;
            for(Player player:this.players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount +=1;
                }
            }
            if(botCount>=2){
                return false;
            }

            Set<Character> existingSymbols=new HashSet<>();
            for (Player player:players){
                if(existingSymbols.contains(player.getSymbol().getaChar())){
                    return false;
                }
                existingSymbols.add(player.getSymbol().getaChar());

            }
            return true;
        }

        public Game build(){
            return new Game(
                    dimension,players,winningStrategies
            );
        }
    }
}



//1.all attributes must be private
//2.have getters and setters for each
//3.ensures all attributes are initialized in constructor