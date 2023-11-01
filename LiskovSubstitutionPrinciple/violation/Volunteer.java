package violation;

public class Volunteer extends Employee{
    Volunteer(int employeeId){
        super(employeeId);
    }

    @Override
    protected double calculateSalary() {
//        System.out.println("Volunteers are not paid.");
        throw new RuntimeException("Volunteers are not paid.");
    }
}
