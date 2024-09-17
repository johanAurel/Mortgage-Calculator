import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for the amount, name, and base cost
        double amountValue;
        String name;
        double baseCostPerYear = 1000;  // Base cost per year (example value)

        // Get currency formatter instance
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

        // Prompt the user to enter the amount
        System.out.print("Enter the amount: ");
        amountValue = scanner.nextDouble(); // Read input as a double

        // Check if the amount is valid
        if (amountValue <= 0) {
            System.out.println("Amount must be greater than zero. Please try again.");
            scanner.close();
            return;  // Exit the program if the input is invalid
        }

        // Format the amount as currency
        String formattedAmount = currencyFormatter.format(amountValue);

        // Consume the newline left-over from nextDouble()
        scanner.nextLine();

        // Prompt the user to enter the name
        System.out.print("Enter the Name: ");
        name = scanner.nextLine().trim(); // Read the name and trim leading/trailing spaces

        // Define available plans (number of years)
        int[] plans = {1, 2, 3};  // Number of years

        // Display the available plans
        System.out.println("Available Plans:");
        System.out.println("1. Plan A - 1 year");
        System.out.println("2. Plan B - 2 years");
        System.out.println("3. Plan C - 3 years");
        
        // Choose the plan number
        System.out.print("Choose a plan number (1-3): ");
        int planNumber = scanner.nextInt();

        // Check if the plan number is valid
        if (planNumber < 1 || planNumber > 3) {
            System.out.println("Invalid plan number. Please choose between 1 and 3.");
            scanner.close();
            return;  // Exit the program if the input is invalid
        }

        // Calculate the total cost based on the selected plan (number of years)
        int years = plans[planNumber - 1];  // Number of years based on the chosen plan
        double totalCost = amountValue + (baseCostPerYear * years);  // Total cost is base amount plus cost for the number of years

        // Calculate the number of months and monthly payment
        int totalMonths = years * 12;  // Total number of months
        double monthlyPayment = totalCost / totalMonths;  // Calculate monthly payment

        // Format the total cost and monthly payment as currency
        String formattedTotalCost = currencyFormatter.format(totalCost);
        String formattedMonthlyPayment = currencyFormatter.format(monthlyPayment);

        // Display the formatted amount, name, total cost, and monthly payment
        System.out.println("\nAmount: " + formattedAmount);
        System.out.println("Name: " + name);
        System.out.println("Selected Plan: " + (planNumber == 1 ? "Plan A - 1 year" : planNumber == 2 ? "Plan B - 2 years" : "Plan C - 3 years"));
        System.out.println("Total Cost: " + formattedTotalCost);
        System.out.println("Monthly Payment: " + formattedMonthlyPayment);

        // Close the Scanner
        scanner.close();
    }
}
