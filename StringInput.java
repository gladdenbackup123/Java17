import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String word = sc.next();

        System.out.println(line);
        System.out.println(word);
    }
}
