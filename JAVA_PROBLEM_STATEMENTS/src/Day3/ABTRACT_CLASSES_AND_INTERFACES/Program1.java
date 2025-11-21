// Consider a Banking Scenario, there are many accounts, like Savings Account, Current
//  Account, Demat Account and so on. We have a base Class Account which contains all the
//  basic properties and methods of an Account. We do have some Maintenance Charges that
//  apply to only some of the accounts. If you would like to enforce that the Savings Account &
//  Current Account should have maintenance charges, then the simplest way is to ask your class
//  to implement the interface. If you do not implement the method in the class, it would raise a
//  compilation error. So, Java Interfaces essentially acts like a contract where it’s given that the
//  methods declared in the interface have to be implemented in the class. Let’s code the above
//  scenario. Create MaintainanceCharge interface with computeMaintainanceCharge method.
//  Create a base Class Account with the fields- name, number, balance, and startDate. Create
//  two subclasses CurrentAccount & SavingsAccount which extends Account and implements
//  Maintenance Charge interface. In the Savings Account the maintenance amount will be
//  2mn+50. In checking Account, the maintenance amount will be mn+200. where m is the
//  maintenance charge per year and n is the number of years. Follow the IO pattern for the input
//  &output. Note: Maintenance charge Rs.50 for saving account and 100 for Current account.
//  Sample input and output 1:
//  1.Current Account
//  2.Savings Account
//  1
//  Name
//  36
// SB
//  Account Number
//  12345
//  Account Balance
//  5000
//  Enter the Start Date(yyyy-mm-dd)
//  2013-04-22
//  Enter the Years
//  2
//  Maintenance Charge For Current Account 400.00
//  Sample input and output 2:
//  1.Current Account
//  2.Savings Account
//  2
//  Name
//  SB
//  Account Number
//  54321
//  Account Balance
//  3000
//  Enter the Start Date(yyyy-mm-dd)
//  2014-04-12
//  Enter the Years
//  5
//  Maintenance Charge For Savings Account 550.00
//  • Case1
//  Input (stdin)
//  1
//  SB
//  12345
//  37
// 5000
//  2013-04-22
//  2
//  Output(stdout)
//  1.CurrentAccount
//  2.SavingsAccount
//  Name
//  AccountNumber
//  AccountBalance
//  EntertheStartDate(yyyy-mm-dd)
//  EntertheYears
//  MaintenanceChargeForCurrentAccount400.00
package Day3.ABTRACT_CLASSES_AND_INTERFACES;
import java.util.Scanner;
interface MaintenanceCharge {
    double computeMaintenanceCharge(int years);
}
class Account {
    protected String name;
    protected int number;
    protected double balance;
    protected String startDate;

    public Account(String name, int number, double balance, String startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }
}
class CurrentAccount extends Account implements MaintenanceCharge {
    public CurrentAccount(String name, int number, double balance, String startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public double computeMaintenanceCharge(int years) {
        return (100 * years) + 200;
    }
}
class SavingsAccount extends Account implements MaintenanceCharge {
    public SavingsAccount(String name, int number, double balance, String startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public double computeMaintenanceCharge(int years) {
        return (50 * years) + 50;
    }
}
public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Current Account");
        System.out.println("2.Savings Account");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Name");
        String name = sc.nextLine();

        System.out.println("Account Number");
        int number = sc.nextInt();

        System.out.println("Account Balance");
        double balance = sc.nextDouble();
        sc.nextLine(); // Consume newline

        System.out.println("Enter the Start Date(yyyy-mm-dd)");
        String startDate = sc.nextLine();

        System.out.println("Enter the Years");
        int years = sc.nextInt();

        if (choice == 1) {
            CurrentAccount currentAccount = new CurrentAccount(name, number, balance, startDate);
            double charge = currentAccount.computeMaintenanceCharge(years);
            System.out.printf("Maintenance Charge For Current Account %.2f%n", charge);
        } else if (choice == 2) {
            SavingsAccount savingsAccount = new SavingsAccount(name, number, balance, startDate);
            double charge = savingsAccount.computeMaintenanceCharge(years);
            System.out.printf("Maintenance Charge For Savings Account %.2f%n", charge);
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}