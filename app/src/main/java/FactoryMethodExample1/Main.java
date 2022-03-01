package FactoryMethodExample1;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
  
        //get an object of Boat and call its name method.
        Vehicle vehicle1 = vehicleFactory.getVehicle("Boat");
  
        //call name method of Boat
        vehicle1.name();
  
        //get an object of Car and call its name method.
        Vehicle vehicle2 = vehicleFactory.getVehicle("Car");
  
        //call name method of Car
        vehicle2.name();
  
        //get an object of Plane and call its name method.
        Vehicle vehicle3 = vehicleFactory.getVehicle("Plane");
  
        //call name method of Plane
        vehicle3.name();
     }
}
