import java.util.*;

public class CountFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
           // map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
