package chessgame;

import java.util.Optional;

public class ChessCell {
    private final Integer x;
    private final Integer y;

    private Optional<ChessPiece> chessPiece;

    ChessCell(Integer x, Integer y){
        this.x = x;
        this.y = y;
        chessPiece = Optional.empty();
    }

    public Integer getX(){
        return x;
    }

    public Integer getY(){
        return y;
    }

    public void setChessPiece(Optional<ChessPiece> chessPiece){
        this.chessPiece = chessPiece;
    }
}
