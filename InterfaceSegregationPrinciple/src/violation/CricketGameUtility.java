package violation;

import java.util.List;

public class CricketGameUtility {

    public void play(List<Player> players){
        for(Player player: players){
            player.bat();
            player.bowl();
            player.field();
            player.keep();
        }
    }
}
