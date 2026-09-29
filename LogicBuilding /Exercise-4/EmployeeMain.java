package com.employee;
import java.util.Scanner;
public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeRegister register = new EmployeeRegister();
        System.out.print("Enter the Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter Employee " + i + " Details:");
            System.out.print("Enter the Firstname: ");
            String firstName = sc.nextLine();
            System.out.print("Enter the Lastname: ");
            String lastName = sc.nextLine();
            System.out.print("Enter the Mobile Number: ");
            long mobileNumber = sc.nextLong();
            sc.nextLine();
            System.out.print("Enter the Email: ");
            String email = sc.nextLine();
            System.out.print("Enter the Address: ");
            String address = sc.nextLine();
            Employee employee = new Employee(
                    firstName,
                    lastName,
                    mobileNumber,
                    email,
                    address
            );
            register.addEmployee(employee);
        }
        System.out.println("\nEmployee List:");
        register.displayEmployees();

        System.out.println("\nTotal Number of Employees: "
                + register.getEmployeeCount());
        sc.close();
    }
}