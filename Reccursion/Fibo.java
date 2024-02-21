package Reccursion;

// TASK----Find the nth fibo number

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }

    static int fibo(int n){
       // base condition
        if(n<2){
            return n;
        }
        
        return fibo(n-1) + fibo(n-2); 
       // now lets put the base condition(you have to put the base condition at first)

    }
}
