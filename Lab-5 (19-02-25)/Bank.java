public class Bank {
    String name;
    Emp emp;

    public Bank(String name, Emp emp) {
        this.name = name;
        this.emp = emp;
    }

    void display() {
        System.out.println(name);
        System.out.println(emp.id + emp.name);
    }
}