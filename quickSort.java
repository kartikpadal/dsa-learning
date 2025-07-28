import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,8,6,5,9};
        quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int low, int high){
        if(low >= high) return;

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while(s <= e){

            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }
        // now sorting for two halves since pivot is at correct place
        quick(arr,low,e);
        quick(arr,s,high);
    }

}
