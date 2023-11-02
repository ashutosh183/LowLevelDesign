package conformation;

public class AllRounder implements Player, Fielder, Bowler{
    @Override
    public void bat(){
        System.out.println("Player can bat");
    }

    @Override
    public void field(){
        System.out.println("Player can field");
    }

    @Override
    public void bowl(){
        System.out.println("Player can bowl");
    }
}
