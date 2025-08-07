import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// my brute force way
//public class KanakaInterviewQues {
//
//        public List<List<Integer>> palindromePairs(String[] words) {
//            List<List<Integer>> list = new ArrayList<>();
//            for(int i=0; i<words.length; i++){
//                for(int j=0; j<words.length; j++){
//                    if(i != j) {
//                        String s = words[i] + words[j];
//                        if(pali(s)){
//                            list.add(Arrays.asList(i,j));
//                        }
//                    }
//                }
//            }
//
//            return list;
//        }
//        boolean pali(String s){
//            int i=0;
//            int j=s.length()-1;
//            while(i < j){
//                if(s.charAt(i++) != s.charAt(j--)){
//                    return false;
//                }
//            }
//            return true;
//        }
//}

import java.util.*;

class KanakaInterviewQues {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Map to store reversed words and their indices
        Map<String, Integer> reversedMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            reversedMap.put(new StringBuilder(words[i]).reverse().toString(), i);
        }

        // Step 2: Special case — check if empty string exists
        int emptyStrIndex = -1;
        if (reversedMap.containsKey("")) {
            emptyStrIndex = reversedMap.get("");
        }

        // Step 3: For each word, check all possible prefix/suffix splits
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Skip empty string handling here; we'll do it separately
            if (word.length() == 0) continue;

            int len = word.length();

            for (int cut = 0; cut <= len; cut++) {
                String prefix = word.substring(0, cut);      // left part
                String suffix = word.substring(cut);         // right part

                // Case 1: If prefix is a palindrome,
                // check if reverse of suffix exists in map
                if (isPalindrome(prefix)) {
                    Integer j = reversedMap.get(suffix);
                    if (j != null && j != i) {
                        result.add(Arrays.asList(j, i));
                    }
                }

                // Case 2: If suffix is a palindrome,
                // check if reverse of prefix exists in map
                // cut != len avoids duplicates
                if (cut != len && isPalindrome(suffix)) {
                    Integer j = reversedMap.get(prefix);
                    if (j != null && j != i) {
                        result.add(Arrays.asList(i, j));
                    }
                }
            }
        }

        // Step 4: Handle empty string case
        if (emptyStrIndex != -1) {
            for (int i = 0; i < words.length; i++) {
                if (i == emptyStrIndex) continue;
                if (isPalindrome(words[i])) {
                    result.add(Arrays.asList(i, emptyStrIndex)); // word + ""
                    result.add(Arrays.asList(emptyStrIndex, i)); // "" + word
                }
            }
        }

        return result;
    }

    // Utility to check if a string is a palindrome
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}

