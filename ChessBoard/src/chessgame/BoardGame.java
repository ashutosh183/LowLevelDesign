package chessgame;

import java.util.Queue;

public abstract class BoardGame {
    private final Board board;
    private final Queue<Player> players;

    BoardGame(Board board, Queue<Player> players){
        this.board = board;
        this.players = players;
    }

    public void startGame(){
        while(true){
            Player currentPlayer = players.poll();
            Move move = currentPlayer.makeMove();
            board.applyMove(move);
            if(isOver()){
                System.out.println(currentPlayer.getName()+" is the winner");
                break;
            }
            players.add(currentPlayer);
        }
    }

    abstract boolean isOver();
}
