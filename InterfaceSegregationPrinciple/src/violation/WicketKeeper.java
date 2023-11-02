package violation;

public class WicketKeeper implements Player{
    @Override
    public void bat(){
        System.out.println("Player is batting");
    }

    @Override
    public void bowl(){
        throw new RuntimeException("wicket keeper so can't bowl");
    }

    @Override
    public void field(){
        throw new RuntimeException("wicket keeper so can't field");
    }

    @Override
    public void keep(){
        System.out.println("Player is keeping");
    }
}
