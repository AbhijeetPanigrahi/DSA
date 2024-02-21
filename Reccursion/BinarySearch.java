package Reccursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] ={2,4,8,9,15,55,56};
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search(int arr[] , int target , int s , int e){

        // int s= arr[0];   (s=start)
        // int e= arr.length-1;     (e=end)
        int m=s+(e-s)/2;      // (m=middle)

        if(s>e){
            return -1;
        }
        if(arr[m]==target){
            return m;
        }

        if(target<arr[m]){
            return search(arr,target,s,e-1);
        }
        else{
            return search(arr, target, s+1, e);
        }
    }
}
