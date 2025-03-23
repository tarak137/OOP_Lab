package Composition;

public class Bus {
    private Driver driver;

    Bus(Driver driver){
        this.driver=driver;
    }
    public void showDriver(){
        System.out.println("Driver Name : "+driver.name);
    }
}