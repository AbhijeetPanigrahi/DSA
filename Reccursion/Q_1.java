package Reccursion;
    public class Q_1{
        public static void main(String[] args) {
            nToOne(5);
            System.out.println("now print 1 to n");
            nToOne_Rev(5);
        }

        static void nToOne(int n){
            if(n==1){
                System.out.println("1");
                return;
            }
            System.out.println(n);
            nToOne(n-1);

          
        }
        static void nToOne_Rev(int n){
            if(n==1){
                System.out.println("1");
                return;
            }
            nToOne_Rev(n-1);
            System.out.println(n);
        }
    }


