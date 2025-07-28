import java.util.Arrays;

public class mergeSortUsingRec {
    public static void main(String[] args) {
        int[] arr = {4,6,8,2,5,6,2,9};

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int m = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,m));
        int[] right = mergeSort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int i=0;
        int j=0;
        int k=0;
        int[] mix = new int[first.length + second.length];

        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // if any ele. left

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
