import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n1 :");
        int n1 = sc.nextInt();
        System.out.println("Enter number n2 :");
        int n2 = sc.nextInt();

        System.out.println("Choose the Operation : + - * /");
        char op = sc.next().charAt(0);

        if(op=='+')
            System.out.println("Addition of n1 and n2 is : "+(n1+n2));
        else if(op=='-')
            System.out.println("Subtraction of n2-n1 is : "+(n2-n1));
        else if(op=='*')
            System.out.println("Multiplication of n1 and n2 is : "+(n1*n2));
        else if(op=='/')
            System.out.println("Division of n1 / n2 is : "+(n1/n2));

    }
}
