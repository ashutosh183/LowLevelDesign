public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1);
        CalculateSalary salary = new CalculateSalary();
        BioData bio = new BioData();
        PerformanceReport performanceReport = new PerformanceReport();
        System.out.println(salary.salaryCalculator(employee));
        System.out.println(bio.retrieveBioData(employee));
        System.out.println(performanceReport.employeePerformance(employee));
    }
}