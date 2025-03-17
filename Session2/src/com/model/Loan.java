package com.model;

public class Loan {

    
    public double calculateLoanAmount(Employee employeeObj) {
        double loanAmount = 0;
        if (employeeObj instanceof PermanentEmployee) {
            loanAmount = 0.15 * employeeObj.getSalary(); // 15% of salary for PermanentEmployee
        } else if (employeeObj instanceof TemporaryEmployee) {
            loanAmount = 0.10 * employeeObj.getSalary(); // 10% of salary for TemporaryEmployee
        }
        return loanAmount;
    }
}
