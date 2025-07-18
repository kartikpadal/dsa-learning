import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,5,2};
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int maxIdx = getMaxIdx(arr, last);
            //now swap maxIdx and last
            int temp = arr[last];
            arr[last] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int getMaxIdx(int[] arr, int last) {
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
