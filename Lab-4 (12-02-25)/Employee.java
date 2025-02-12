public class Employee {
    int id;
    String name;
    String joiningDate;

    Employee(int id, String name, String joiningDate) {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
    }

    void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(joiningDate);
    }
}
