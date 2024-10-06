public class Print1toN {
    public static void main(String[] args) {
        //Print numbers from 1 to N
        //N=10 -> 1 2 3 4 5 6 7 8 9 10

        int N = 10;
        for(int i=1 ; i<=N ; i++){
            System.out.println(i);
        }

        //counter=1 -> 1
        //counter=2 -> 2
        //counter=3 -> 3 .....
        //counter=10 -> 10
        //counter=11 -> Condition not satisfied - Loop terminated

    }
}
