package violation;

public class Intern extends Employee{
    Intern(int employeeId){
        super(employeeId);
    }

    @Override
    protected double calculateSalary(){
        System.out.println("Disbursed Salary for Intern Employee");
        return 0.0;
    }
}
