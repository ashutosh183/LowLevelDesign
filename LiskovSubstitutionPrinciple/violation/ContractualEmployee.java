package violation;

public class ContractualEmployee extends Employee{
    ContractualEmployee(int employeeId){
        super(employeeId);
    }

    @Override
    protected double calculateSalary(){
        System.out.println("Disbursed Salary for Contractual Employee");
        return 0.0;
    }
}
