package Backtracking;

public class AllPaths {
    public static void main(String[] args){
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        allPath("", board, 0,0);
    }


    // printing all possible paths (i.e. can move in all 4 directions) w/o any blocks :
    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // we're considering this block in our path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c+1);
        }

        if (r > 0) {
            allPath(p + 'U', maze, r-1, c);
        }

        if (c > 0) {
            allPath(p + 'L', maze, r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }


    // printing how the steps look in the matrix:

    static void allPathPrint(String p, boolean [][] maze, int r, int c, int[][] path, int step){

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1){
            allPathPrint(p + 'D', maze, r, c+1, path, step+1);
        }

        if(c < maze[0].length - 1){
            allPathPrint(p + 'R', maze, r, c+1, path, step+1);
        }

        if(r > 0){
            allPathPrint(p + 'U', maze, r-1, c, path, step+1);
        }

        if(c > 0){
            allPathPrint(p + 'L', maze, r, c-1, path, step+1);
        }


        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
