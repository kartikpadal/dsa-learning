import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {5,4,1,3,2};
        for(int i=0; i < arr.length - 1; i++){
            for(int j=i+1; j > 0; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;

    }

}
