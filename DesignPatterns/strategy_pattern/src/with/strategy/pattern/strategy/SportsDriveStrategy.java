package with.strategy.pattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("Sports Drive strategy");
    }
}
