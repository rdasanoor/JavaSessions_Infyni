package inheritance.singleInheritance;

public class Vehicle {

    private String typeOfVehicle;
    private int noOfTires;

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void displayVehicleInformation() {
        System.out.println("Type of Vehicle::" + typeOfVehicle);
        System.out.println("No of tires::" + noOfTires);
    }
}
