package Strings;
//make a string without a's


public class Stream {
    public static void main(String[] args){
        System.out.println(skipBatman("abatbatmanccad"));
    }


    //skips the word 'batman'
    static String skipBatman(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("batman") ){
            return skipBatman(up.substring(6));
        }
        else{
            return up.charAt(0) + skipBatman(up.substring(1));
        }
    }


    //skips the word 'bat' and not batman
    static String skipBat(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("bat") && (!up.startsWith("batman"))){
            return skipBatman(up.substring(3));
        }
        else{
            return up.charAt(0) + skipBatman(up.substring(1));
        }
    }


    //with recursion
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }
    }


    // without recursion
//    static void skip(String p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//
//        if(ch == 'a'){
//            skip(p,up.substring(1));
//        }
//        else{
//            skip(p+ch, up.substring(1));
//        }
//    }

}

