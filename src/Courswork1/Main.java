package Courswork1;

public class Main {
    public static void main(String[] args) {
        int numOfEmployees = 3;

        Employee employee1 = new Employee(1, "a", "b", "c", 23, "d");
        Employee employee2 = new Employee(2, "e", "f", "g", 33, "h");
        Employee employee3 = new Employee(3, "i", "j", "k", 43, "l");


        Employee [] employees = new Employee[0];

        EmployeeBook book = new EmployeeBook(employees);

        Employee employee4 = new Employee(4, "m", "n", "o", 53, "p");

        book.addNewEmployee(employee4, numOfEmployees);
        book.addNewEmployee(employee3, numOfEmployees);
        book.addNewEmployee(employee2, numOfEmployees);
        book.deleteEmployee(3);

        book.changeSalary(4, 786);
        book.changeDepartment(4, "part");
        System.out.println(book.printArray());

        book.printEmployeesDept();


    }


}