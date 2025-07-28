import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {3,6,3,5,8,1,9,2,6};
        mergeSort(arr, 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int s, int e){
        if(e - s == 1){
            return ;
        }

        int m = (s + e)/2;

        mergeSort(arr, s, m);
        mergeSort(arr, m , e);

        merge(arr, s , m, e);
    }

    static void merge(int[] arr, int s, int m, int e){
        int i=s;
        int j=m;
        int k=0;
        int[] mix = new int[e-s];

        while(i<m && j<e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // if any ele. left

        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
