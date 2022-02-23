public class Controller {
    public static void main(String[] args) {
        System.out.println("=======================================================");
        System.out.println("Employees");
        System.out.println("=======================================================");

        Manager m1 = new Manager(123, "Jharby", 150000, "HR", "Manager");
        m1.displayMethod();
        System.out.println();

        Manager m2 = new Manager(425, "Joel", 100000, "R&D", "Manager");
        m2.displayMethod();
        System.out.println();

        Clerk c1 = new Clerk(256, "Saravia", 50000, "Accounts", "Clerk");
        c1.displayMethod();

        System.out.println();

        // if else statement to test the overriden equals method
        if (c1.getDesignation().equals(m1.getDesignation()))
            System.out.println("The designations are the same");
        else
            System.out.println(m1.getEmployeeName() + " and " + c1.getEmployeeName() + " have different Designations.");

        System.out.println();

        System.out.println();
        System.out.println("=======================================================");
        System.out.println("Employee Leave");
        System.out.println("=======================================================");

        System.out.println("Employee: E" + m1.getEmployeeID());
        m1.daysPresent();
        System.out.println();

        System.out.println("Employee: E" + m2.getEmployeeID());
        m2.daysPresent();
        System.out.println();

        System.out.println("Employee: E" + c1.getEmployeeID());
        c1.daysPresent();
        System.out.println();


        System.out.println("Employee M1 deductions: $" + m1.deductions());
        System.out.println("Employee M2 deductions: $" + m2.deductions());
        System.out.println("Employee C1 deductions: $" + c1.deductions());
        System.out.println();

        // 2d array  to create the table of absence and days present plus deduction
        System.out.println("Employee ID:\tPresent:\t\tAbsent:\t\t\tDeduction:");
        int[][] deductions = {{m1.getEmployeeID(), m1.present, m1.daysAbsent(), (int) m1.deductions()},{m2.getEmployeeID(), m2.present, m2.daysAbsent(),
                (int) m2.deductions()},{c1.getEmployeeID(), c1.present, c1.daysAbsent(), (int) c1.deductions()}};
        for(int i = 0; i < deductions.length;i++){
            for(int j = 0; j < deductions[i].length;j++){
                System.out.print(deductions[i][j] + "\t\t\t\t");

            }
            System.out.println("");

        }
        // calculates the deduction of all the employees
        double totalDeduction = c1.deductions() + m1.deductions() + m2.deductions();
        System.out.println("Total Deductions : $" + totalDeduction);



    }
}
