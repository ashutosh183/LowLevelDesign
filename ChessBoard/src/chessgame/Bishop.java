package chessgame;

public class Bishop implements ChessPiece{
    private final Color color;
    private final PieceName pieceName;
    private boolean isDead;

    Bishop(Color color, PieceName pieceName, boolean isDead){
        this.color = color;
        this.pieceName = pieceName;
        this.isDead = isDead;
    }
    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    @Override
    public boolean isDead() {
        return this.isDead;
    }

    @Override
    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    @Override
    public PieceName getName() {
        return this.pieceName;
    }
}
