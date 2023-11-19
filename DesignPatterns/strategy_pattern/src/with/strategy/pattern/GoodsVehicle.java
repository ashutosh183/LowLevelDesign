package with.strategy.pattern;

import with.strategy.pattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle(){
        super(new NormalDriveStrategy());
    }
}
