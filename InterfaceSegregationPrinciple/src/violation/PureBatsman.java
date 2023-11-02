package violation;

public class PureBatsman implements Player{
    @Override
    public void bat(){
        System.out.println("Player is batting");
    }

    @Override
    public void bowl(){
        throw new RuntimeException("pure batsman so can't bowl");
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
