package FactoryMethodExample2;

public class Plane implements Vehicle{
    private double weight;

    public Plane(double weight) {
        this.weight = weight;
    }

    @Override
    public void name(){
        System.out.println("This is a plane that weights "+weight+"kg");
    }
}
