import java.util.UUID;

public class SBIAccount implements BankInterface {

    private String name;
    private String accountno;
    private int balance;
    private String password;
    private double interestrate;

    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.interestrate = 6.5;
        this.accountno = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        balance = balance + amount;
        return amount +"has been deposited to your account.";
    }

    @Override
    public String withdraw(int amount,String enteredPassword) {
        if(enteredPassword.equals(password)){
            if(balance >= amount){
                balance -= amount;
                return amount+"has been deducted from your account.";
            }
            else
                return "Insufficient balance.";
        }
       else return "pls enter correct password.";
    }

    @Override
    public Double CalculateInterest(int time) {
        return (balance * time*interestrate)/100;
    }
}
