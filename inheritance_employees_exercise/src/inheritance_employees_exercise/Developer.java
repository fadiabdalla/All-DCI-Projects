package inheritance_employees_exercise;

public class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Salary: $" + salary);
    }
}