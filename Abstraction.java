abstract class Shape{
    String color = "red";
    abstract int area(); //abstract method

    String getColor(){ //concrete
        return color;
    }
}

class Rectangle extends Shape{
    int length = 5;
    int breadth = 3;

    public int area(){
        return length*breadth;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.area());
        System.out.println(r.getColor());
    }
}
