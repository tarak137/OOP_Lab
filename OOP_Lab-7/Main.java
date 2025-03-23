public class Main {
    public static void main(String[] args) {
        BankAccount b = new CheckAccount(101, 500000);
        b.display();
        System.out.println("Get Balance : " + b.getBalance());
        b.withdraw();
        b.deposit();

    }
}