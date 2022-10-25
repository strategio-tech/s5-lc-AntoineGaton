package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param ???
     * @return ???
     */
    static void getRemainingAmountIn3Months(int amount, int months) {
        // TODO: Rewrite this method
        int remaining = amount;
        for (int i=1;i<=months;i++){
            double payment = 0.1 * amount;
            System.out.println("Month "+i+":");
            System.out.println("Payment: 10% of "+amount+" = " + (int)payment);
            amount = (int) (amount - payment);
            System.out.println("Remaining amount: " + amount);
            System.out.println("================================");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("================================");
            System.out.print("Enter an amount: ");
            int amount = scanner.nextInt();
            System.out.print("Enter number of months: ");
            int months = scanner.nextInt();
            System.out.println("================================");
            getRemainingAmountIn3Months(amount, months);
        }
    }
}
