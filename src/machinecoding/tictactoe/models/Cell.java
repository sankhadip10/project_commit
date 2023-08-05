package machinecoding.tictactoe.models;

public class Cell {
    private int row;
    private int col;
    private CellState cellState;

    private Player player;

    public Cell(int row,int col){
        this.row=row;
        this.col=col;
        this.cellState=CellState.EMPTY;
    }
    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public void display(){
        if(getCellState().equals(CellState.EMPTY)){
            System.out.printf("- | ");

        }else {
            System.out.printf(" "+getPlayer().getSymbol().getaChar()+" |");
        }
    }
}
