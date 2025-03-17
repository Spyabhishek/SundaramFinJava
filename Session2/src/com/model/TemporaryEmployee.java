package com.model;

public class TemporaryEmployee extends Employee {
    private int hoursWorked;
    private int hourlyWages;

    // Constructor to initialize employeeId, employeeName, hoursWorked, and hourlyWages
    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    // Getter and Setter methods for hoursWorked and hourlyWages
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }

    // Implementing calculateSalary() method
    @Override
    public void calculateSalary() {
        double salary = hoursWorked * hourlyWages; // Salary based on hours worked
        setSalary(salary);
    }
}
