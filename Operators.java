import java.util.ArrayList;
import java.util.Arrays;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'b'); //195  (ascii)
        System.out.println("a" + "b"); //ab
        System.out.println(('a' + 3));  // 100  (ascii)
        System.out.println((char)('a' + 3));  //d

        System.out.println("a" + 1);  //a1
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("kartik" + new ArrayList<>());  //kartik[]
        System.out.println("kartik" + new Integer(45));  // kartik45
        String ans = new Integer(45) + "" + new ArrayList<>();
        System.out.println(ans);   //45[]

        System.out.println("a" + 'b');  //ab

        System.out.println(Arrays.toString(new int[]{}) + 1); // []1

    }
}
