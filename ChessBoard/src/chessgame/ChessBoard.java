package chessgame;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard implements Board{

    private final List<List<ChessCell>> cells;
    private static final int rowCount = 8;
    private static final int colCount = 8;
    public ChessBoard(){
        this.cells = new ArrayList<>();
        for(int i=0; i<rowCount; i++){
            List<ChessCell> chessCell = new ArrayList<>();
            for(int j=0; j<colCount; j++){
                chessCell.add(new ChessCell(i, j));
            }
            cells.add(chessCell);
        }
    }
    @Override
    public void display() {

    }

    @Override
    public void applyMove(Move move) {

    }
}
