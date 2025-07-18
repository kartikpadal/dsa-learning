import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,5,2,3,4};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    static int[] bubble(int[] arr){
        boolean swapped;
        for(int i=0; i < arr.length; i++){

            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]) {
                    //swap
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){         // jar swapped==false ahe tr yacha arth as ki, array already sort jali ani
                break;            // ata pudh ajun sort karaychi garaj nhi
            }
        }
        return arr;
    }
}
