package Day2.Inheritance;

import java.util.Scanner;

class Account {
    protected int accountID;
    protected String holderName;
    protected long balance;

    public Account(int accountID, String holderName, long balance) {
        if (accountID >= 100 && accountID <= 999) {
            this.accountID = accountID;
        } else {
            this.accountID = -1;
        }
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
        this.holderName = holderName;
    }

    public long credit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public void setAccountBalance(long newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        } else {
            balance = 0;
        }
        System.out.println(balance);
    }

    public long getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getHolderName() {
        return holderName;
    }

}
class VIPAccount extends Account {
    public VIPAccount(int accountID, String holderName, long balance) {
        super(accountID, holderName, balance);
    }

    @Override
    public void setAccountBalance(long newBalance) {
        System.out.println("The balance can be negative but no less than -10000");
        if (newBalance < -10000) {
            balance = -10000;
        } else {
            balance = newBalance;
        }
        System.out.println(balance);
    }
}

public class AccountMain{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            long initialBalance = sc.nextLong();
            long amountToCredit = sc.nextLong();
            long negativeBalanceArg = sc.nextLong();

            Account acc = new Account(id, name, initialBalance);
            System.out.println(acc.getAccountID() + " " + acc.getHolderName() + " " + acc.getBalance());

            long newBal = acc.credit(amountToCredit);
            System.out.println(newBal);

            acc.setAccountBalance(acc.getBalance());

            VIPAccount vip = new VIPAccount(acc.getAccountID(), acc.getHolderName(), acc.getBalance());
            vip.setAccountBalance(negativeBalanceArg);
        }
    }
}
