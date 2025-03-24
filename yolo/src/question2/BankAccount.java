package question2;

public class BankAccount {
    private double balance;
    private int accountNumber;
    public BankAccount() {
    }
    public BankAccount(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void getMoney(double amount) throws InsufficientBalanceException {
        if (amount > this.balance) {
            throw new InsufficientBalanceException(
                    "账户号码为"+this.accountNumber+"的用户余额不足,无法提取"+amount+"元");
        }
        this.balance -= amount;
        System.out.println("成功提取");
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10000.0,11111111);
        try {
            bankAccount.getMoney(100000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }




    }


}
