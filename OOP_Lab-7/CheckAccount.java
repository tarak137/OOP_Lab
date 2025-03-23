public class CheckAccount extends BankAccount {
    CheckAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw() {
        System.out.println("1000 Taka withdraw successful");
    }

    @Override
    void deposit() {
        System.out.println("15000 taka deposit successful");
    }
}