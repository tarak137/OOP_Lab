public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Bogura", "Rajshahi", "Bangladesh");
        Address address2 = new Address("Comilla", "Chittagong", "BD");

        Emp e = new Emp(137, "tarak", address1);
        Emp e2 = new Emp(232, "sami", address2);

        Bank b = new Bank("DBBL", e);

        e.display();
        e2.display();
        b.display();

    }
}