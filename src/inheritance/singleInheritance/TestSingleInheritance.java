package inheritance.singleInheritance;

public class TestSingleInheritance {

    public static void main(String[] args) {

        Car car = new Car();

        car.setTypeOfVehicle("4 wheeler");
        car.setNoOfTires(4);
        car.setName("Scoda");
        car.setBrand("DntKnw");
        car.setColor("Blue");

        car.displayVehicleInformation();
        car.displayCarInformation();
    }
}
