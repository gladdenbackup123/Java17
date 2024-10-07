class Dog{
    //attributes
    String breed;
    int age;
    String colour;

    //constructor - to initialize objects
    Dog(String b, int a , String c){
        breed = b;
        age = a;
        colour = c;
    }

    //methods
    void eat(){
        System.out.println("Dog is eating!");
    }
    void bark(){
        System.out.println("Dog is barking!");
    }
    void sleep(){
        System.out.println("Dog is sleeping");
    }
}

public class Demo {
    public static void main(String[] args) {
        Dog tommy = new Dog("Labrador",2,"brown");
        Dog sheru = new Dog("Indian",1,"black");

        System.out.println(tommy.colour);
        tommy.eat();
        tommy.bark();
        tommy.sleep();

        System.out.println(sheru.colour);

    }
}
