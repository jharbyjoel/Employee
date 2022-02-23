import java.util.Scanner;

public class Manager extends Employee{
    private double bonus;
     int present;
    Scanner userInput = new Scanner(System.in);


    public Manager(){
        super();

    }

    public Manager(int employeeID, String employeeName, double salary, String department, String designation){
        super(employeeID,employeeName,salary,department,designation);
        this.bonus = 300;

    }
    @Override
    public int daysPresent(){
        System.out.print("Days present out of 20: ");
        int present1 = userInput.nextInt();
        present = present1;
        return present;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }



    public int daysAbsent(){
        int absent = 20 - present ;
        return absent;

    }

    @Override


    public double deductions(){
        double deductions = (getSalary() + bonus ) / 20 * daysAbsent() ;
        return deductions;

    }

    @Override
    public double addBonus(){
        return getSalary() + bonus;
    }
    public boolean equals(Object obj) {
        Manager m = (Manager) obj;

        return this.getDesignation().equals(m.getDesignation());

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
