package com.employee;
import java.util.ArrayList;
import java.util.List;
public class EmployeeRegister {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public int getEmployeeCount() {
        return employees.size();
    }
    public void displayEmployees() {
        employees.sort((e1, e2) ->
                e1.getFirstName().compareToIgnoreCase(e2.getFirstName()));
        System.out.printf(
                "%-15s %-15s %-15s %-25s %-15s%n",
                "FirstName",
                "SecondName",
                "MobileNumber",
                "Email",
                "Address"
        );
        for (Employee employee : employees) {

            System.out.printf(
                    "%-15s %-15s %-15d %-25s %-15s%n",
                    employee.getFirstName(),
                    employee.getLastName(),
                    employee.getMobileNumber(),
                    employee.getEmail(),
                    employee.getAddress()
            );
        }
    }
}