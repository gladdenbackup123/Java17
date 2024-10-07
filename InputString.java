import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter yout first name :");
        String first_name = sc.nextLine();
        System.out.println("Enter your last name :");
        String last_name = sc.nextLine();
        System.out.println("Enter your current age :");
        int age = sc.nextInt();

        String full_name = first_name+" "+last_name;
        System.out.println("Your fullname is : "+full_name);
        System.out.println("Your age is :"+age);


        //integer - nextInt()
        //Full line String - nextLine()
        //Single Token String - next()
        //float - nextFloat()
        //double - nextDouble
    }
}
