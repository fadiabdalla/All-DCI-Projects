package runtime_polymorphism_employee_payroll;

public class PayrollCalculator {
    public static void main(String[] args) {
      
        Employee[] employees = new Employee[4];
        employees[0] = new PermanentEmployee("Fadi", 3750, 250);
        employees[1] = new PermanentEmployee("Sam", 5500, 750);
        employees[2] = new ContractEmployee("Sarah", 17, 164);
        employees[3] = new ContractEmployee("Mery", 17, 175);

        for (Employee employee : employees) {
        	System.out.println(employee.getClass().getSimpleName());
            System.out.println("Employee: " + employee.getName());
            System.out.println("Payroll: $" + employee.calculatePayroll());
            System.out.println(); 
        }
    }
}