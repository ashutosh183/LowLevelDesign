package chessgame;

public class Move {
    private final Pair src;
    private final Pair dest;

    Move(Pair src, Pair dest){
        this.src = src;
        this.dest = dest;
    }

    public Pair getSrc(){
        return src;
    }

    public Pair getDest(){
        return dest;
    }
}
