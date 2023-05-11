package Courswork1;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;

public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int Length() {
        return employees.length;
    }

    public String printArray() {
        return Arrays.toString(employees);
    }

    public Employee[] copyOfEmployees(int numberOfEmployees) {
        return Arrays.copyOf(employees, numberOfEmployees);
    }

    public void addNewEmployee(Employee employee, int numberOfEmployees) {
        Employee[] nemEmployees = copyOfEmployees(numberOfEmployees);
        for (int i = 0; i < numberOfEmployees; i++) {
            if (nemEmployees[i] == null) {
                nemEmployees[i] = employee;
                employees = nemEmployees;
                break;
            }
        }
    }

    public void deleteEmployee(int id) {

        for (int i = 0; i <= employees.length; i++) {
            if (employees.length == 0) {
                break;
            } else if (employees[i] instanceof Employee) {
                if (employees[i].getId() == id) {
                    employees[i] = null;
                    break;
                }
            }
        }

    }
    
    public void changeSalary(int id, int sal) {
        for (int i = 0; i <= employees.length; i++) {
            if (employees[i] instanceof Employee) {
                if (employees[i].getId() == id) {
                    employees[i].setSalary(sal);
                    break;
                }
            }
        }
    }

    public void changeDepartment(int id, String dep) {
        for (int i = 0; i <= employees.length; i++) {
            if (employees[i] instanceof Employee) {
                if (employees[i].getId() == id) {
                    employees[i].setDepartment(dep);
                    break;
                }
            }
        }
    }

    public void printEmployeesDept() {
        String[] departments = new String[employees.length];
        int l = 0;
        for (Employee employee:employees){
            if (employee instanceof Employee){
                departments[l++] = employee.getDepartment();
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList(departments));
        Set<String> set = new HashSet<>(list);

        String[] uniqueDepartments = new String[set.size()];

        int k = 0;
        for (String i: set) {
            uniqueDepartments[k++] = i;
        }

        for (String department : uniqueDepartments){
            if (department instanceof String){
                System.out.println("Department " + department + ":");
            }
            for (Employee employee : employees){
                if (employee instanceof Employee){
                    if (employee.getDepartment() == department){
                        System.out.println(employee.getLastName() + " " + employee.getFirstName() +
                                " " + employee.getPatronymicNameName());
                    }
                }
            }
        }


    }
    }


