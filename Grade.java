public class Grade {
    public static void main(String[] args) {
        int marks = 25;

        if (marks>=80){
            System.out.println("Grade A");
        }
        else if (marks>=70){
            System.out.println("Grade B");
        }
        else if (marks>=60){
            System.out.println("Grade C");
        }
        else if (marks>=40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
    }
}
