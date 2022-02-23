import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private int employeeID;
    private String employeeName;
    private double salary;
    private String department;
    private String designation;
    private int present;
    private double bonus = 200;
    Scanner userInput = new Scanner(System.in);




    // no argument constructor
    public Employee(){

    }

    public Employee(int employeeID, String employeeName, double salary, String department, String designation){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salary = salary;
        this.department = department;
        this.designation = designation;

    }
    public int daysPresent(){
        System.out.print("Days present out of 20: ");
        int present1 = userInput.nextInt();
        present = present1 ;
        return present1;
    }

    public int daysAbsent(){
        int absent = 20 - present ;
        return absent;

    }

    public double deductions(){
        double deductions = (getSalary() + bonus ) / 20 * daysAbsent() ;
        return deductions;

    }



    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }



    public double addBonus(){
        double bonus = 200;
        return bonus + salary;
    }

    public boolean equals(Object obj) {
        Employee e = (Employee) obj;

        return this.designation.equals(e.designation);

    }


}
