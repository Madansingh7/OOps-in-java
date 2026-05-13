import java.util.Scanner;

// Custom Checked Exception
class InsufficientFundsException extends Exception {

    InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {

    double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Withdraw Method
    void withdraw(double amount) throws InsufficientFundsException {

        if(amount > balance) {

            throw new InsufficientFundsException(
                "Withdrawal failed: Insufficient balance"
            );
        }

        else if((balance - amount) < 1000) {

            throw new InsufficientFundsException(
                "Withdrawal failed: Minimum balance of Rs.1000 must be maintained"
            );
        }

        else {

            balance = balance - amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: Rs." + balance);
        }
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();

        BankAccount b = new BankAccount(balance);

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        try {

            b.withdraw(amount);

        } catch(InsufficientFundsException e) {

            System.out.println("\nException Caught");
            System.out.println(e.getMessage());
        }
    }
}
