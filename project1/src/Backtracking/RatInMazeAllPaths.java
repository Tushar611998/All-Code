package Backtracking;

public class RatInMazeAllPaths {
    public static void ratInAMaze(int maze[][],int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Print output as specified in the question
         */
        int path[][] = new int[maze.length][maze.length];
        solveMaze(maze,0,0,path);

    }

    public static void solveMaze(int[][] maze, int i, int j, int[][] path)
    {
        //Check if i,j are valid pair of indices => i,j>=0
        int n=maze.length;
        if (i<0 || j<0 || i>=n || j>=n)
            return;

        //If cell is already part of the path
        if (path[i][j]==1)
            return;

        //If cell is blocked in maze (cell value=0)
        if (maze[i][j]==0)
            return;

        //If all previous conditions fail, then the cell is a possible path
        //Include the cell in current path
        path[i][j]=1;

        //If we have reached ending point
        if (i==n-1 && j==n-1)
        {
            for (int row=0;row<n;row++)
            {
                for (int col=0;col<n;col++)
                {
                    System.out.print(path[row][col]+" ");
                }

                //System.out.println();
            }
            path[i][j]=0;
            System.out.println();
            return;
        }
        //Changing the recursive calls to find all the paths
        solveMaze(maze,i-1,j,path);
        solveMaze(maze,i,j+1,path);
        solveMaze(maze,i+1,j,path);
        solveMaze(maze,i,j-1,path);
        path[i][j]=0;


        //If none of the conditions are satisfied, then the path is not working out
        return;
    }

    public static void main(String[] args) {
        int maze[][] = {{1, 0, 1},{1, 0, 1},{1,1,1}};
        ratInAMaze(maze,maze.length);
    }
}
