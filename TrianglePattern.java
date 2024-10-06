public class TrianglePattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1 ; i<=n ; i++){ //i=1 , 2 , 3 , 4 ,5
            for(int j=1 ; j<=i ; j++){ 
                System.out.print("*"); //*****
            }
            System.out.println(); //change line
        }

        //i=1 - *
        //i=2 - **
        //i=3 - ***
        //i=4 - ****
        //i=5 - *****
    }
}
