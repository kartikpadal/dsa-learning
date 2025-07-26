import java.util.Arrays;

public class selecSortUsingRec {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,3,9,1,3};
        sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int e, int s, int max){
        if(e == 0) return;

        if(s<e){
            if(arr[s] > arr[max]){
                sort(arr,e,s+1,s) ;
            }
            else{
                sort(arr,e,s+1,max);
            }
        }
        else{
            // swap
            int t = arr[max];
            arr[max] = arr[e-1];
            arr[e-1] = t;
            sort(arr,e-1,0,0);
        }
    }
}
