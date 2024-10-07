class Car{
    //Attributes
    String brand;
    String model;
    int year;
    String color;

    //methods
    void start(){
        System.out.println("Car starting...");
    }
    void brake(){
        System.out.println("Brakes applied, car stopped");
    }
}


public class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Mahindra";
        c1.model = "Thar";
        c1.year = 2022;
        c1.color = "black";

        System.out.println(c1.brand + " " + c1.model);
        System.out.println(c1.year);
    }
}
