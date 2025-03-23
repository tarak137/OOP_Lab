
package Composition;

public class Main {
    public static void main(String[] args) {
        Car c= new Car("BMW");
        c.startCar();

        Driver d=new Driver("Sakib");
        Bus b = new Bus(d);
        b.showDriver();
    }
}
