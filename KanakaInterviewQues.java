import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// my brute force way
public class KanakaInterviewQues {

        public List<List<Integer>> palindromePairs(String[] words) {
            List<List<Integer>> list = new ArrayList<>();
            for(int i=0; i<words.length; i++){
                for(int j=0; j<words.length; j++){
                    if(i != j) {
                        String s = words[i] + words[j];
                        if(pali(s)){
                            list.add(Arrays.asList(i,j));
                        }
                    }
                }
            }

            return list;
        }
        boolean pali(String s){
            int i=0;
            int j=s.length()-1;
            while(i < j){
                if(s.charAt(i++) != s.charAt(j--)){
                    return false;
                }
            }
            return true;
        }


}

