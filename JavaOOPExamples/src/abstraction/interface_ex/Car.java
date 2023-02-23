package abstraction.interface_ex;

public class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }
    
    public void stop() {
        System.out.println("Car is stopping");
    }
}