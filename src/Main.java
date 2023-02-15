import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name ,balance, password");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int balance = sc.nextInt();
        String password = sc.next();

        SBIAccount shrutisbi = new SBIAccount(name,balance,password);
        System.out.println("Your account has been created " +shrutisbi.getAccountno());

        System.out.println("Your account balance is rs "+shrutisbi.getBalance());

        System.out.println("Amount deposited = "+shrutisbi.depositMoney(sc.nextInt()));

        System.out.println("New balance = "+ shrutisbi.getBalance());

        System.out.println("Enter amount you want to withdraw ");
        int amount = sc.nextInt();
        System.out.println("Please enter your password .");
        String passwordentered = sc.next();

        System.out.println(shrutisbi.withdraw(amount,passwordentered));
        System.out.println("Your balance is "+shrutisbi.getBalance());

        System.out.println("Enter years to calculate Interest");
        int time = sc.nextInt();
        System.out.println("Interest for " +time + " years is on current balance is "+shrutisbi.getBalance()+" is "+shrutisbi.CalculateInterest(time));
    }
}