package inheritance_employees_exercise;

public class Employee {
    private String name;
    private int employeeID;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void calculateSalary() {}

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
    }
}