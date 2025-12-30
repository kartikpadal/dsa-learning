package Backtracking;

public class Maze {
    public static void main(String[] args){

        System.out.println(count(3,3));
    }


    //count no of ways to go from top left to bottom left: can only go right & down
    static int count(int r, int c){
        if(r == 1 || c == 1) return 1;

        int left = count(r-1,c);
        int right = count(r, c-1);

        return left + right;
    }
}
