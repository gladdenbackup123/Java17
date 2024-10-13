interface Vehicle{
    void start();
    void stop();
}


class Car implements Vehicle{
    public void start(){
        System.out.println("Car started...");
    }
    public void stop(){
        System.out.println("Brakes applied , car stopped...");
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike started...");
    }
    public void stop(){
        System.out.println("Brakes applied , bike stopped...");
    }
}


public class Interface {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();

        Bike b = new Bike();
        b.start();
        b.stop();
    }
}
