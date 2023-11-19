package with.strategy.pattern;

import with.strategy.pattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
