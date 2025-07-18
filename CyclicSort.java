import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        int i=0;
        while(i < arr.length){
            int idx = arr[i];
            if(arr[i] != i+1) {
                swap(arr, idx - 1, i);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
