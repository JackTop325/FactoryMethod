package FactoryMethodExample2;

public class Car implements Vehicle{
    private double weight;

    public Car(double weight) {
        this.weight = weight;
    }

    @Override
    public void name(){
        System.out.println("This is a car that weights "+weight+"kg");
    }
}
