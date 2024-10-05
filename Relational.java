public class Relational {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 7;
        System.out.println(n1<n2); //true 3<7 
        System.out.println(n1>n2); //false

        int a = 5;
        int b = 7;
        System.out.println(a==b); //false
        a = b; // a = 7
        System.out.println(a==b); //true

        System.out.println(5<=7); //true
        System.out.println(5<=5); //true

        System.out.println(5>=7); //false
        System.out.println(5>=5); //true

        System.out.println(5!=7); //true -> 5 is not equal to 7
        System.out.println(5!=5); //false -> 5 is equal to 5

        // = vs == ??
        // = is assignment operator -> a = 5 , value of a is 5
        // == realtional operator -> a==5 , is a equal to 5 ? true or false
    }
}
