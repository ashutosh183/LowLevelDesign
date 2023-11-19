package with.strategy.pattern;

import with.strategy.pattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
