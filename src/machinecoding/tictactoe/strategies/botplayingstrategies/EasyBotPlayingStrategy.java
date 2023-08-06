package machinecoding.tictactoe.strategies.botplayingstrategies;

import machinecoding.tictactoe.models.Board;
import machinecoding.tictactoe.models.Cell;
import machinecoding.tictactoe.models.CellState;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Cell makeMove(Board board) {
        for(List<Cell> row:board.getBoard()){
            for (Cell cell:row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return cell;
                }
            }
        }
        return null;//you should never come here
    }
}
