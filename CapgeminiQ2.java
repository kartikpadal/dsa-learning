
import java.util.*;

// given:
//
//An integer array arr of length n
//
//Indices are 0-based
//
//You must find the maximum value of j - k such that:
//
//arr[j] ≥ arr[k]  and  j > k
//
//
//If no such pair exists, print -1.

//Example (from your screenshot)
//Input
//n = 5
//arr = [30, 2, 27, 22, 3]
//
//Output
//3

public class CapgeminiQ2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (n == 0) {
                System.out.println(-1);
                return;
            }

            // Step 1: Build rightMax array
            int[] rightMax = new int[n];
            rightMax[n - 1] = arr[n - 1];

            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
            }

            // Step 2: Two-pointer technique
            int i = 0, j = 0, maxDiff = -1;

            while (i < n && j < n) {
                if (arr[i] <= rightMax[j]) {
                    maxDiff = Math.max(maxDiff, j - i);
                    j++;
                } else {
                    i++;
                }
            }

            System.out.println(maxDiff);
        }
    }


