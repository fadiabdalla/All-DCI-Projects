package runtime_polymorphism_employee_payroll;

class ContractEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayroll() {
        return hourlyRate * hoursWorked;
    }
}