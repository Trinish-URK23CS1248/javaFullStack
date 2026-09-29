package com.employee;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class EmployeeFile {
    private static final String FILE_NAME = "employees.txt";
    public void addEmployee(Employee employee) {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(
                employee.getEmployeeId() + "," +
                employee.getEmployeeName() + "," +
                employee.getEmployeeAge() + "," +
                employee.getEmployeeSalary()
            );
            pw.close();
        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }
    }
    public void displayAll() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                System.out.println("No employees found.");
                return;
            }
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                System.out.println(
                    data[0] + " " +
                    data[1] + " " +
                    data[2] + " " +
                    data[3]
                );
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}