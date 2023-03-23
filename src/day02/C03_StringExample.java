package day02;

public class C03_StringExample {
    public static void main(String[] args) {
        /**
         * write a program to show total employee in your company
         * giving branch numbers
                * giving employee numbers
         * print out totalEmployee
                */
        int branchNUmber, employeeNumber, totalEmployee;
        branchNUmber = 12;
        employeeNumber = 60;
        totalEmployee = branchNUmber * employeeNumber;
        System.out.println("--\tThe program shows total employee--------\t-");
        System.out.println("\tIn my company has " + branchNUmber + " branch\t" + "\nEach branch has " + employeeNumber + " employee");
        System.out.println("Each branch has " + employeeNumber + " employee");
        System.out.println("Total employee numbers are " + totalEmployee + " ");

    }
}
