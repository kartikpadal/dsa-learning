package InterviewQuestions.CognizantPrep;
import java.util.*;

// There is a lift that has capacity of carrying only X weight
// The weights of people planning to use the lift are given in an array.

// Find and return the value of max no. of ppl that can use the lift together.

// Input 1 : No. of ppl planning to use the lift
// Input 2 : max weight carrying limit of the lift
// Input 3 : array of  weights of ppl

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxPPL(arr,limit));
    }

    static int maxPPL(int[] arr, int limit){
        Arrays.sort(arr);
        int sum = 0;
        int c=0;
        for(int a : arr){
            if(sum + a <= limit){
                sum += a;
                c++;
            }
            else{
                break;
            }
        }
        return c;
    }
}
