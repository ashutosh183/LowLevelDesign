package without.strategy.pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehicle v = new OffRoadVehicle();
        v.drive();

        Vehicle v1 = new Vehicle();
        v1.drive();
    }
}