package runtime_polymorphism_employee_payroll;

class PermanentEmployee extends Employee {
    private double salary;
    private double bonus;

    public PermanentEmployee(String name, double salary, double bonus) {
        super(name);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double calculatePayroll() {
        return salary + bonus;
    }
}
