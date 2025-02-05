public class Main {
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
        int a = sum(7, 4);
        double b = sum(2.2, 3.3);
        String c = sum("Tarak","Rahman");
        System.out.println("int: "+ a);
        System.out.println("double: "+ b);
        System.out.println("String: "+ c);
    }
}