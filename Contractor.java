/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;

/**
 *
 * @author Win11
 */
public class Contractor extends Employee {
  
    private double contractAmount;
    private int contractDuration; 
    private double taxRate;

   
    public Contractor(String name, int employeeId, String department,
                      double contractAmount, int contractDuration, double taxRate) {
        super(name, employeeId, department);
        this.contractAmount = contractAmount;
        this.contractDuration = contractDuration;
        this.taxRate = taxRate;
    }

    
    @Override
    public double calculateSalary() {
        double monthlyPay = contractAmount / contractDuration;
        return monthlyPay - (monthlyPay * taxRate);
    }

    
    public void displayType() {
        System.out.println("Employee Type: Contractor");
    }
}

