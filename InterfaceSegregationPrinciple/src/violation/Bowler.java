package violation;

public class Bowler implements Player{
    @Override
    public void bat(){
        System.out.println("Player is batting");
    }

    @Override
    public void bowl(){
        System.out.println("Player is bowling");
    }

    @Override
    public void field(){
        System.out.println("Player is fielding");
    }

    @Override
    public void keep(){
        throw new RuntimeException("Player not allowed to keep the wickets");
    }
}
