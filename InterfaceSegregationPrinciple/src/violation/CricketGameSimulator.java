package violation;

import java.util.ArrayList;
import java.util.List;

public class CricketGameSimulator {
    public static void main(String[] args){
        PureBatsman pureBatsman = new PureBatsman();
        Bowler bowler = new Bowler();
        WicketKeeper wicketKeeper = new WicketKeeper();

        List<Player> players = new ArrayList<>();
        players.add(bowler);

        CricketGameUtility utility = new CricketGameUtility();
        utility.play(players);
    }
}
