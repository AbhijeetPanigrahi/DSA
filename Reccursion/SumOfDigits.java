package Reccursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Sum of digits: "+ sum(15)); 
        System.out.println("Product of digits: "+ prd(15)); 
    }
    static int sum(int n){
        
        if(n==0){
            return 0;
        }
        return sum(n/10)+n%10;
    }
//  product of digits
    static int prd(int n){
        
        if(n%10==n){
            return n;
        }
        return sum(n/10)*n%10;
    }

}
