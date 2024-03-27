package Reccursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Fact(4));
    }

    static int Fact(int num){

        if(num==1){
            return 1;
        }
        int fact = num*Fact(num-1);
        return fact;
    }
}
