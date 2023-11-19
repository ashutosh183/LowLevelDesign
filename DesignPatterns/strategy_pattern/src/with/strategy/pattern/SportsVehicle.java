package with.strategy.pattern;

import with.strategy.pattern.strategy.DriveStrategy;
import with.strategy.pattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
