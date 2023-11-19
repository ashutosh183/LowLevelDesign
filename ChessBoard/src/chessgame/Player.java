package chessgame;

public abstract class Player {
    private final String name;

    Player(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    abstract Move makeMove();
}
