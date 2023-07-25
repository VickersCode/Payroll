import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        // Create payroll object
        Payroll dude = new Payroll("Hannibal", 12345);

        // Create scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Ask dude for rate and time
        System.out.println("Enter the hourly rate:");
        dude.setPayRate(scan.nextDouble());

        System.out.println("Enter the hours worked:");
        dude.setHours(scan.nextDouble());

        // Print total gross pay
        System.out.println("Total gross pay is: $" + dude.grossPay(dude.getPayRate(), dude.getHours()));

        scan.close();
    }
}
