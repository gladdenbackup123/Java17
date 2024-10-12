class Dad{
    int bankBalance = 5000000;
    
    void eat(){
        System.out.println("Eating Salad....");
    }

    void drive(){
        System.out.println("Driving Ferrari...");
    }
}

class Son extends Dad{
    void eat(){
        System.out.println("Eating Pizza...");
    }
    void drive(){
        System.out.println("Driving WagonR");
    }
    void exercise(){
        System.out.println("Working out in the Gym!");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dad vijay = new Dad();
        // vijay.eat();
        // vijay.drive();

        Son monty = new Son();
        monty.eat();
        monty.drive();
        monty.exercise();

    }
}
