import java.util.Arrays;

 class bubSortUsingRec {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,2,1};
        bubbleUsingRecursion(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

static void bubbleUsingRecursion(int[] arr, int r, int c) {
    if (r == 0) {
        return;
    }
    if (r > c) {
        if (arr[c] > arr[c + 1]) {
            int t = arr[c + 1];
            arr[c + 1] = arr[c];
            arr[c] = t;
        }

        bubbleUsingRecursion(arr, r, c + 1);
    } else {
        bubbleUsingRecursion(arr, r - 1, 0);
    }
}

}

