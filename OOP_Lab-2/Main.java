/* you have to take input name.title,salary from user.incriment it and
show the yearly salary.use display function for printout
 */
    import java.util.*;
    public class Main {
        String name;
        String title;
        int salary;
        void incrementSalary() {
            salary += 5000;
            System.out.println("Incremented Salary: " + salary);
        }
        void calculateYearlySalary() {
            double yearlySalary = salary * 12;
            System.out.println("Yearly Salary: " + yearlySalary);
        }
        void display() {
            System.out.println("Employee Details:");
            System.out.println("Name: " + name);
            System.out.println("Title: " + title);
            System.out.println("Salary: " + salary);
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = input.nextLine();
            System.out.println("Enter title: ");
            String title = input.nextLine();
            System.out.println("Enter Salary: ");
            int salary = input.nextInt();
            Main e = new Main(); // class is main and object is e
            e.name = name;
            e.title = title;
            e.salary = salary;
            e.incrementSalary();
            e.calculateYearlySalary();
            e.display();

            input.close();
        }
    }

