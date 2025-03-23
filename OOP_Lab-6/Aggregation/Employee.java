public class Employee {
    String name;
    AddressInfo address;
    InsuranceInfo insurance;

    Employee(String name,AddressInfo address,InsuranceInfo insurance){
        this.name=name;
        this.address=address;
        this.insurance=insurance;
    }
    void display() {
        System.out.println("TR");
    }

}