package violation;

public class FullTimeEmployee extends Employee{

    FullTimeEmployee(int employeeId){
        super(employeeId);
    }

    @Override
    protected double calculateSalary(){
        System.out.println("Disbursed Salary for FullTime Employee");
        return 0.0;
    }
}
