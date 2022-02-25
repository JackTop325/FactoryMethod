package FactoryMethod;

public class VehicleFactory {
    //use getVehicle method to get object of type vehicle 
    public Vehicle getVehicle(String vehicleType){
       if(vehicleType == null){
          return null;
       }		
       if(vehicleType.equalsIgnoreCase("Boat")){
          return new Boat();
          
       } else if(vehicleType.equalsIgnoreCase("Car")){
          return new Car();
          
       } else if(vehicleType.equalsIgnoreCase("Plane")){
          return new Plane();
       }
       return null;
    }
 }