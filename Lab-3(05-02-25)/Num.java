public class Num {

    int x;

    public Num() {
        x = 5;
    }

    public Num(int y) {
        x = y;
    }

    public static void main(String[] args) {
        Num obj = new Num();
        Num obj1 = new Num(5);
        System.out.println(obj.x);
        System.out.println(obj1.x);
    }
}
