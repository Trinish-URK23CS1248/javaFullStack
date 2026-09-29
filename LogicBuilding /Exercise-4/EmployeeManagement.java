package com.employee;
import java.util.ArrayList;
public class EmployeeManagement {
    private ArrayList<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void displayAll() {

        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee employee : employees) {
            System.out.println(
                employee.getEmployeeId() + " " +
                employee.getEmployeeName() + " " +
                employee.getEmployeeAge() + " " +
                employee.getEmployeeSalary()
            );
        }
    }
}