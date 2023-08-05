package machinecoding.tictactoe.strategies.botplayingstrategies;

import machinecoding.tictactoe.models.Board;
import machinecoding.tictactoe.models.Cell;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);
}
