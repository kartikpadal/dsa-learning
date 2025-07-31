import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Declare an array of integers
        // int[] numbers = {1, 2, 3, 4, 5};
        // for(int i=0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }

        String[] names = {"kartik","zebra","padal","rajesh"};
        // System.out.println(name.length);
        Arrays.sort(names);
        //enhanced for loop
        for (String name : names){
            System.out.println(name);
        }
    }
}