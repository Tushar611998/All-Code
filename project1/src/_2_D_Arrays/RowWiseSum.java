package _2_D_Arrays;
import java.util.Scanner;
public class RowWiseSum {
    public static void rowWiseSum(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for(int j = 0;j<mat[i].length;j++){
                sum = sum +mat[i][j];
            }
            System.out.print(sum + " ");

        }
        System.out.println();
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
        int [][] mat = input();
        rowWiseSum(mat);

    }
}

