package conformation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CricketGameSimulator {
    public final List<PureBatsman> pureBatsman;
    public final List<AllRounder> allRounders;
    public final List<Bowl> bowlers;
    public final WicketKeeper wicketKeeper;
    public final CricketGameHelper cricketGameHelper;

    public CricketGameSimulator(List<PureBatsman> pureBatsman, List<AllRounder>allRounders, WicketKeeper wicketKeeper, List<Bowl> bowlers, CricketGameHelper cricketGameHelper){
        this.pureBatsman = pureBatsman;
        this.allRounders = allRounders;
        this.wicketKeeper = wicketKeeper;
        this.bowlers = bowlers;
        this.cricketGameHelper = cricketGameHelper;
    }

    public void simulate(){
        System.out.println("Simulation Started!!!");
        startBowling();
        startBatting();
        startFielding();
        startKeeping();
    }

    public void startBatting(){
        for(PureBatsman pureBatsmen: pureBatsman){
            pureBatsmen.bat();
        }
        wicketKeeper.bat();
        for(Bowl bowler: bowlers){
            bowler.bat();
        }
        for(AllRounder allRounder: allRounders){
            allRounder.bat();
        }
    }

    public void startFielding(){
        for(PureBatsman pureBatsmen: pureBatsman){
            pureBatsmen.field();
        }
        for(Bowl bowler: bowlers){
            bowler.field();
        }

        for(AllRounder allRounder: allRounders){
            allRounder.field();
        }
    }

    public void startBowling(){
        for(AllRounder allRounder: allRounders){
            allRounder.bowl();
        }
        for(Bowl bowler: bowlers){
            bowler.bowl();
        }
    }

    public void startKeeping(){
        wicketKeeper.keep();
    }

    public static void main(String[] args) {
        List<PureBatsman> pureBatsmen = Arrays.asList(new PureBatsman(), new PureBatsman(), new PureBatsman(), new PureBatsman());
        List<AllRounder> allRounders = Arrays.asList(new AllRounder(), new AllRounder(), new AllRounder());
        WicketKeeper wicketKeeper = new WicketKeeper();
        List<Bowl> bowlers = Arrays.asList(new Bowl(), new Bowl(), new Bowl());
        CricketGameHelper gameHelper = new CricketGameHelper();

        CricketGameSimulator simulator = new CricketGameSimulator(pureBatsmen, allRounders, wicketKeeper, bowlers, gameHelper);
        simulator.simulate();
    }
}
