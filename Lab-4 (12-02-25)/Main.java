public class Main {
    public static void main(String[] args) {
        Employee obj1 = new Employee(137, "Tarak", "22/12/2024");
        SoftwareEng obj2 = new SoftwareEng(10000);
        HR obj3 = new HR(15000);
        obj1.display();
        obj2.displaySalary();
        obj3.displaySalary();
    }
}
