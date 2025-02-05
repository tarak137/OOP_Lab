import java.util.*;
public class Math {
    static int sum(int x, int y) {
        return x + y;
    }
    static double sum(double x, double y) {
        return x + y;
    }
    static String sum(String x, String y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int number: ");
        int a = sc.nextInt();
        System.out.println("Enter double number: ");
        double b = sc.nextDouble();
        System.out.println("Enter String: ");
        String c = sc.nextLine();
        System.out.println("int: "+ a);
        System.out.println("double: "+ b);
        System.out.println("String: "+ c);
    }
}
