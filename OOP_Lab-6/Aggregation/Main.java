public class Main {
    public static void main(String[] args) {
        AddressInfo a= new AddressInfo("Bogura","BD","5800");
        InsuranceInfo i = new InsuranceInfo("Daffodil",100);
        Employee e = new Employee("Tarak",a,i);
        e.display();
        a.display();
    }
}