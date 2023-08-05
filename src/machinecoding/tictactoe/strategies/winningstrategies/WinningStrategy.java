package machinecoding.tictactoe.strategies.winningstrategies;

import machinecoding.tictactoe.models.Board;
import machinecoding.tictactoe.models.Move;

public interface WinningStrategy {
   boolean checkWinner(Board board, Move move);
}
