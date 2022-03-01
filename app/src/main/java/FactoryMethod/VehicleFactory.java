package FactoryMethod;

public class VehicleFactory {
    //use getVehicle method to get object of type vehicle 
    public Vehicle getVehicle(String vehicleType,double weight){
       if(vehicleType == null){
          return null;
       }		
       if(vehicleType.equalsIgnoreCase("Boat")){
          return new Boat(weight);
          
       } else if(vehicleType.equalsIgnoreCase("Car")){
          return new Car(weight);
          
       } else if(vehicleType.equalsIgnoreCase("Plane")){
          return new Plane(weight);
       }
       return null;
    }
 }