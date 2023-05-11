package Courswork1;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymicName;
    private int salary;
    private String department;
    public Employee(int id, String lastName, String firstName,String patronymicName, int salary,String department){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.salary = salary;
        this.department = department;
    }

    public int getId(){
        return id;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getPatronymicNameName(){
        return patronymicName;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }
    @Override
    public String toString(){
        return "ID: "+ id + ", last name: " + lastName + ", first name: " + firstName + ", patronymic: " +
                patronymicName + ", salary: " + salary + ", department: " + department;
    }
}

