/*
QUESTION:
Exercise 4: Employee Management System
Scenario: You are developing an employee management system for a company to manage employee records stored in an array.
Instructions:
1. Define an Employee class with employeeId, name, position, salary.
2. Implement methods for add, search, traverse, and delete operations using arrays.
*/

class EmployeeRecord {
    int employeeId;
    String name;
    String position;
    double salary;

    public EmployeeRecord(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[" + employeeId + "] " + name + " - " + position + " ($" + salary + ")";
    }
}

public class Exercise4_EmployeeManagementSystem_Solution {
    private EmployeeRecord[] employees;
    private int count;

    public Exercise4_EmployeeManagementSystem_Solution(int capacity) {
        employees = new EmployeeRecord[capacity];
        count = 0;
    }

    public void addEmployee(EmployeeRecord emp) {
        if (count < employees.length) {
            employees[count++] = emp;
        }
    }

    public EmployeeRecord searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) return employees[i];
        }
        return null;
    }

    public void traverse() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                employees[i] = employees[count - 1];
                employees[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Exercise4_EmployeeManagementSystem_Solution sys = new Exercise4_EmployeeManagementSystem_Solution(5);
        sys.addEmployee(new EmployeeRecord(1, "John", "Developer", 75000));
        sys.addEmployee(new EmployeeRecord(2, "Jane", "Manager", 90000));
        sys.traverse();
    }
}
