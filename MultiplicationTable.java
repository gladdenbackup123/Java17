public class MultiplicationTable {
    public static void main(String[] args) {
        //Multiplication table of 7
        //7 14 21 28 35 42 49 63 70


        for(int i=7 ; i<=70 ; i+=7){
            System.out.println(i);
        }

        //i=7 - 7
        //i=14 - 14
        //i=21 - 21
        //i=28 - 28
        //...
        //i=70 - 70
        //i=77 - loop end


        int n = 13;
        for(int i=1 ; i<=10 ; i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
        //n x i = n*i
        //i=1 - 13*1 = 13
        //i=2 - 13*2 = 26
        //i=3 - 13*3 = 39

        //n=13 , i=2 , n*i = 26
    }
}
