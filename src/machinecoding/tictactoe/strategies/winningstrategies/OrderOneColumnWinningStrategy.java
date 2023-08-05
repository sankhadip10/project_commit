package machinecoding.tictactoe.strategies.winningstrategies;

import machinecoding.tictactoe.models.Board;
import machinecoding.tictactoe.models.Move;

public class OrderOneColumnWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
