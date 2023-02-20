package _2_D_Arrays;
import java.util.Scanner;
public class PrintBySpiralPattern {
    public static void spiralPrint(int matrix[][]) {
        int p =0;
        int q = p;
        while(p<=matrix.length/2) {

            for (int i = p; i < matrix.length - p; i++) {
                if (i == p) {
                    for (int j = q; j < matrix[0].length - q; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                } else if (i < matrix.length - 1 - p) {
                    System.out.print(matrix[i][matrix[0].length - 1-p] + " ");
                } else if (i == matrix.length - 1 - p) {
                    for (int j = matrix[0].length - 1 - q; j > 0 + q; j--) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
                if (i == matrix.length - 1 - p) {
                    for (int j = matrix.length - 1 - q; j > 0 + q; j--) {
                        System.out.print(matrix[j][0 + p] + " ");
                    }
                }
            }
            p++;
            q++;
        }
    }
    public static int[][] input(){
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter total no. of rows");
        int rows = sc.nextInt();

//        System.out.println("Enter total no. of cols");
        int cols = sc.nextInt();

        int input[][] =  new int [rows][cols];

        for(int i = 0;i<rows;i++){
            for(int j =0;j<cols;j++){
//                System.out.println("Enter element at row "+ i + " & col " + j);
                input[i][j] = sc.nextInt();
            }
        }
        return input;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int[][] mat = input();
        spiralPrint(mat);
    }

}
