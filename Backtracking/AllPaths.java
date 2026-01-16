package Backtracking;

public class AllPaths {
    public static void main(String[] args){
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
    }

    static void allPath(String p, boolean [][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) return;

        // we're considering this block in our path:
        maze[r][c] = false;

        if()
    }

}
