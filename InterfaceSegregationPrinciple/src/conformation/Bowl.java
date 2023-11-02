package conformation;

public class Bowl implements Player, Bowler, Fielder{
    @Override
    public void bat(){
        System.out.println("Player can bat");
    }

    @Override
    public void bowl(){
        System.out.println("Player can bowl");
    }

    @Override
    public void field(){
        System.out.println("Player can field");
    }
}
