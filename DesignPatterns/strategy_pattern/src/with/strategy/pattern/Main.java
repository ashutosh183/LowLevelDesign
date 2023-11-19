package with.strategy.pattern;

public class Main {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();
    }
}
