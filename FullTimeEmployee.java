/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author Win11
 */
public class FullTimeEmployee extends Employee {
   
    private double basicSalary;
    private double allowance;
    private double bonus;

    
    public FullTimeEmployee(String name, int employeeId, String department,
                            double basicSalary, double allowance, double bonus) {
        super(name, employeeId, department);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.bonus = bonus;
    }

    
    @Override
    public double calculateSalary() {
        return basicSalary + allowance + bonus;
    }

    
    public void displayType() {
        System.out.println("Employee Type: Full-Time");
    }
}
