import java.util.Arrays;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        int c = 0;
        String[] arr = s.split(",");

        int n = arr.length;
        boolean[] used = new boolean[n];
        for(int i=0; i<n; i++){
            String item = arr[i];
            if(used[i]) continue;
            String num = item.substring(0,item.length()-1);
            char type  = item.charAt(item.length()-1);
            String match = "";
            if(type == 'B'){
                match = num + "C";
            }
            else{
                match = num + "B";
            }
            for(int j=i+1; j <= i+3 && j<n; j++){
                if(arr[j].equals(match)){
                    used[i] = true;
                    used[j] = true;
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}



