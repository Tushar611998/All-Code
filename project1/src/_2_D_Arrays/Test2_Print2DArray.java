package _2_D_Arrays;

public class Test2_Print2DArray {
    public static void print2DArray(int input[][]) {
        for(int i =0;i<input.length;i++){
            for(int k = input.length-1-i;k>=0;k--){
                for (int j = 0;j<input[0].length;j++){
                    System.out.print(input[i][j] + " ");
                }
                System.out.println();
            }
        }
        // Write your code here

    }

}
