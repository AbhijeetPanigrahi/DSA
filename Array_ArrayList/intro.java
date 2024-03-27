//  datatype[] var_name = new datatype[size] ;
/* In JAVA array objects are in heap and heap objects are not continuous */

package Array_ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class intro {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[5];
    // user input
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
    //     System.out.println();
    //     System.out.println(arr[2]);     // index 2 element
    // //  System.out.println(arr[5]);    // index out of bound errror    
    //     System.out.println(Arrays.toString(arr));   // [_,_,_,_]

        // Array of objects
        String[] str = new String[4];
        for(int i=0; i< str.length; i++ ){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
