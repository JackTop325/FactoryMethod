package FactoryMethod;

public class Boat implements Vehicle{
    private double weight;

    public Boat(double weight){
        this.weight = weight;
    }
    @Override
    public void name(){
        System.out.println("This is a boat that weights "+weight+"kg");
    }
}
