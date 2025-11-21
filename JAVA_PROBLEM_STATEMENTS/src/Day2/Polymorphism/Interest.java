package Day2.Polymorphism;

import java.util.Scanner;

class Bank {

    private static final double SAVINGS_RATE = 0.04;
    private static final double FIXED_RATE = 0.06;
    private static final double RECURRING_RATE = 0.05;

    public double getInterestRate(String type, double amount) {
        if (type.equalsIgnoreCase("Savings"))
            return amount * SAVINGS_RATE;
        else if (type.equalsIgnoreCase("FixedDeposit"))
            return amount * FIXED_RATE;
        else if (type.equalsIgnoreCase("RecurringDeposit"))
            return amount *RECURRING_RATE;
        return 0;
    }

    public double getInterestRate(int typeCode, double amount) {
        switch (typeCode) {
            case 1 -> {
                return amount * SAVINGS_RATE;
            }
            case 2 -> {
                return amount * FIXED_RATE;
            }
            case 3 -> {
                return amount * RECURRING_RATE;
            }
            default -> {
            }
        }
        return 0;
    }

    public double getInterestRate(double fixedAmount, double depositAmount) {
        return depositAmount * FIXED_RATE;
    }
}

public class Interest {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String accType = sc.nextLine();
            double amount = sc.nextDouble();
            
            Bank bank = new Bank();
            double interest = bank.getInterestRate(accType, amount);
            
            System.out.println("Interest: " + interest);
        }
    }
}