public class MethodOverloading {
    public static int add(int n1,int n2){
        int ans = n1+n2;
        return ans;
    }

    public static String add(String s1,String s2){
        String ans = s1+s2;
        return ans;
    }

    public static int add(int n1,int n2,int n3){
        int ans = n1+n2+n3;
        return ans;
    }

    public static String add(String s1, int n1){
        String ans = s1+n1;
        return ans;
    }

    public static String add(int n1,String s1){
        String ans = n1+s1;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(add(5,7));  //12
        System.out.println(add(5,7,9)); //21
        System.out.println(add("Hello ","World")); //Hello World
        System.out.println(add("Hello",5)); //Hello5
        System.out.println(add(5,"Hello")); //5Hello
    }

    //Method Overloading - same function name
    //1- Different no. of parameters
    //2- Different datatype of parameters 
    //3- Different order of parameters
}
