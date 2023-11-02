package conformation;

public class WicketKeeper implements Player, Keeper{
    @Override
    public void bat(){
        System.out.println("Player can bat");
    }

    public void keep(){
        System.out.println("Player can keep");
    }
}
