package Strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        //pad("", "12");
        System.out.println(padList("", "12"));
    }

    // normal returning as strings
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int d = up.charAt(0) - '0';

        for(int i=(d-1); i<(d*3); i++){
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }


    // return in a arraylist
    static ArrayList<String> padList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int d = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();

        for(int i=(d-1); i<(d*3); i++){
            char ch = (char)('a' + i);
            ans.addAll(padList(p + ch, up.substring(1)));
        }

        return ans;
    }

}
