import java.util.Scanner;
public class Hello{
    public static void main(String[] args) {
        // int i,j,k;
        // for(i=0; i<5; i++){
        //     for(j=5-i; j>1; j--){
        //         System.out.print(" ");
        //     }
        //     for(k=0; k<=i; k++){
        //         System.out.print("* "); 
                    
        //     }    
            
        //     System.out.println();
        // }

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        


    }
}



