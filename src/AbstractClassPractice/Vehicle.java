package AbstractClassPractice;

public abstract class Vehicle {
    public abstract void drive();
    public abstract void stop();
    public abstract void fly();

}
class Toyota extends Vehicle{

    @Override
    public void drive() {
        System.out.println(getClass().getName()+" start driving.");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getName());
    }

    @Override
    public void fly() {

    }
}
class Mazda extends Vehicle{

    @Override
    public void drive() {
        System.out.println(getClass().getName()+"  start driving.");

    }

    @Override
    public void stop() {
        System.out.println(getClass().getName()+" stop.");

    }

    @Override
    public void fly() {
        System.out.println(getClass().getName()+" flying.");

    }

}