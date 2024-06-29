package inheritance_employees_exercise;

public class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        double salary = baseSalary + bonus;
        System.out.println("Salary: $" + salary);
    }
}