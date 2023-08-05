package machinecoding.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size){
        this.size=size;
//        based on board,I need to initialize board and all the cells inside it
        this.board=new ArrayList<>();
        for (int i=0;i<size;i++){
            board.add(new ArrayList<>());
            for (int j=0;j<size;j++){
                board.get(i).add(new Cell(i,j));

            }
        }

//        [
// [Cell(0,0), Cell(0,1), Cell(0,2)],
// [Cell(1,0), Cell(1,1), Cell(1,2)],
// [Cell(2,0), Cell(2,1), Cell(2,2)]
//]
    }
    public void setSize(int size) {
        this.size = size;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public int getSize() {
        return size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void print(){
      for (List<Cell> row:board){
          System.out.printf("|");
          for (Cell cell:row){
            cell.display();
          }
          System.out.println();
      }
    }

    //|-|X|-|
    //|-|-|-|
    //|-|-|-|
}
