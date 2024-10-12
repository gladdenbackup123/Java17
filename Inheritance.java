class Animal{
    int legs =4;

    void eat(){
        System.out.println("Animal is eating...");
    }
    void sleep(){
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();

        Dog tommy = new Dog();
        tommy.bark();
        tommy.eat();
    }
}
