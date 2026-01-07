/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employee;
import java.util.ArrayList;
/**
 *
 * @author Win11
 */
public class PayrollTest {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

      
        employees.add(new FullTimeEmployee(
                "Alice", 1001, "HR", 4000, 800, 500));

        employees.add(new PartTimeEmployee(
                "Bob", 1002, "IT", 80, 25, 10));

        employees.add(new Contractor(
                "Charlie", 1003, "Finance", 24000, 12, 0.10));

        
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.printf("Salary: RM %.2f%n", emp.calculateSalary());
            System.out.println("-----------------------------");
        }
    }
}
