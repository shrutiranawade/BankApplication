public interface BankInterface {
    int getBalance();
    String depositMoney(int amount);
    String withdraw(int amount,String enteredpassword);
    Double CalculateInterest(int time);
}
