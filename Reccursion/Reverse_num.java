package Reccursion;

public class Reverse_num {
    public static void main(String[] args) {
        rev_num(12345);
        System.out.println(sum); 
        
        System.out.println(check_pal(12345));
    }
    static int sum = 0;
    static void rev_num(int n){
        if(n==0){
            return;
        }
        
        int rem=n%10;
        sum = sum*10 + rem;
        rev_num(n/10);
        
    }
    static boolean check_pal(int n){
        rev_num(n);
        int rev = n;
        return n == sum;
    }
}
