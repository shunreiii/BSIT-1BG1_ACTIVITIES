package org.cruz_shaun;
import java.util.Scanner;

public class HayupNaProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Item menu with prices
        String[] items = {"Espresso", "Latte", "Cappuccino", "Americano"};
        double[] prices = {2.50, 3.00, 3.50, 2.00};

        double totalCost = 0.0;
        String choice;

        while (true) {
            System.out.println("** Coffee Shop POS **");
            System.out.println("1. Espresso\t\t₱2.50");
            System.out.println("2. Latte\t\t₱3.00");
            System.out.println("3. Cappuccino\t₱3.50");
            System.out.println("4. Americano\t₱2.00");
            System.out.println("5. Checkout");

            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            if (choice.equals("5")) {
                break;
            }

            int itemIndex = Integer.parseInt(choice) - 1;
            totalCost += prices[itemIndex];

            System.out.println("Item added to cart.");
        }

        System.out.println("\n** Receipt **");
        System.out.println("Total Cost: ₱" + totalCost);

        // Simulate payment processing
        System.out.print("Enter payment amount: ₱");
        double payment = scanner.nextDouble();

        if (payment >= totalCost) {
            System.out.println("Payment successful. Thank you!");
            double change = payment - totalCost;
            if (change > 0) {
                System.out.println("Change: ₱" + change);
            }
        } else {
            System.out.println("Insufficient payment. Please try again.");
        }

        scanner.close();
    }
}