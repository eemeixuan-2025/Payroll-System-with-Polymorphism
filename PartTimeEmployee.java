/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author Win11
 */
public class PartTimeEmployee extends Employee {
    
    private int hoursWorked;
    private double hourlyRate;
    private double overtimeHours;

    
    public PartTimeEmployee(String name, int employeeId, String department,
                            int hoursWorked, double hourlyRate, double overtimeHours) {
        super(name, employeeId, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.overtimeHours = overtimeHours;
    }

    
    @Override
    public double calculateSalary() {
        return (hoursWorked * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
    }

    
    public void displayType() {
        System.out.println("Employee Type: Part-Time");
    }
}

