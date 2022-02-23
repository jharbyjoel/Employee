import java.util.Objects;
import java.util.Scanner;

public class Clerk extends Employee{
    private double bonus;
     int present;
    Scanner userInput = new Scanner(System.in);

    public Clerk(){
        super();
    }

    public Clerk(int employeeID, String employeeName, double salary, String department, String designation){
        super(employeeID, employeeName, salary, department, designation);
        this.bonus = 100;

    }
    @Override
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

    @Override
    public double addBonus(){
        return getSalary() + bonus;
    }

    public double deductions(){
        double deductions = (getSalary() + bonus ) / 20 * daysAbsent() ;
        return deductions;

    }

    public boolean equals(Object obj) {
        Clerk c = (Clerk) obj;

        return this.getDesignation().equals(c.getDesignation());

    }


    public void displayMethod(){
        System.out.println("Employee ID: E" + getEmployeeID());
        System.out.println("Employee name: " + getEmployeeName());
        System.out.println("Department name: " + getDepartment());
        System.out.println("Salary: $" + getSalary());
        System.out.println("Designation: " + getDesignation());
        System.out.println("Salary after adding bonus is: $" + addBonus());
    }



}
