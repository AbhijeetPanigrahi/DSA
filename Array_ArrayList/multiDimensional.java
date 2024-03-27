package Array_ArrayList;
/*
    1 2 3   ( single Dimensional array )

    1 2 3   ( multi-dimensinal array )
    2 3 4
    5 6 7
 */
public class multiDimensional {
    public static void main(String[] args) {
        int[][] arr= new int[3][]; // adding row value is mandatory
        int[][] arr2d = {
            {1,2,3}, // 0th index
            {4,5},  // 1st index
            {6,7,8,9} // 2nd index
        };
        // System.out.println(arr.length);
        // System.out.println(arr2d.length);
        for(int i=0; i<arr2d.length; i++){              // i -> row
            for(int j=0; j<arr2d[i].length; j++){       // j -> coloumn
                System.out.println(arr2d[i][j]);
            }
            
        }
        
    }
}
