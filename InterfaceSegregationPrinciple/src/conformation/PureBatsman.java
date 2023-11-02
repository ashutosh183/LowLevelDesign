package conformation;

public class PureBatsman implements Player, Fielder{
    @Override
    public void bat(){
        System.out.println("Player can bat");
    }

    @Override
    public void field(){
        System.out.println("Player can field");
    }
}
