package runtime_polymorphism_employee_payroll;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculatePayroll() {
        return 0.0;
    }
}
