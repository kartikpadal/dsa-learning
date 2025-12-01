package Strings;
import java.util.*;

public class SubSeq {
    public static void main(String[] args){
        System.out.println(subseq2Ascii("","abc"));
        //subseqAscii("","abc");
    }

    // normal subsequences
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    //subsequences with ascii values
    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p+(ch+0), up.substring(1));
    }

    //subsequeces in an arraylist:
    static ArrayList<String> subseq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseq2(p+ch, up.substring(1));
        ArrayList<String> right = subseq2(p, up.substring(1));

        left.addAll(right);
        return left;
    }


    //subsequences with their ascii values in an arraylist:
    static ArrayList<String> subseq2Ascii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subseq2Ascii(p+ch, up.substring(1));
        ArrayList<String> second = subseq2Ascii(p, up.substring(1));
        ArrayList<String> third = subseq2Ascii(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
