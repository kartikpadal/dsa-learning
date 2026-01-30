package InterviewQuestions.CognizantPrep;

//Find and return an integer value representing the total number of subarrays of size 3 such that the sum of the
// first ele and third ele is equal to second ele.
// Input 1 : an integer array of size N
// Input 2 : an integer N , size of the array
// Output : return an integer value representing the total no. of subarrays of size 3 such that 1st + 3rd = 2nd


public class Q1 {
    public static void main(String[] args){
         int[] arr = {1,4,3,5,6,7,8,8,9,1};
         int n = arr.length;

         int count = 0;
         for(int i=0; i<n-2; i++){
             if(arr[i] + arr[i+2] == arr[i+1]){
                 count++;
             }
         }
         System.out.println(count);
    }
}
