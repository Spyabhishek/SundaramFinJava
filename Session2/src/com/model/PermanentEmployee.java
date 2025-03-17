package com.model;

public class PermanentEmployee extends Employee {
    private double basicPay;

    
    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }

   
    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

   
    @Override
    public void calculateSalary() {
        double salary = basicPay - (0.12 * basicPay); // 12% deduction
        setSalary(salary);
    }
}
