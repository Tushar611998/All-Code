package _2_D_Arrays;
import java.util.Scanner;
public class SumOfBoundriesAndDiagonal {
    public static void totalSum(int[][] mat) {
        int sum =0;
        int row = mat.length;
        for (int i=0;i <row;i++) {
            for (int j = 0; j < row; j++) {
                if (i==0){
                    sum = sum + mat[i][j];
                }
                else if(i == row -1){
                    sum = sum + mat[i][j];
                }
                else{
                    sum = sum + mat[i][j];
                    j = j+row -2;
                }
            }
        }
        for(int k = 1;k <mat.length-1;k++){
            int index = 1;
            for (int l = 0 ;l< mat.length-1;l++){
                if(k==l){
                    sum = sum + mat[k][l];
                }
                else if (l == (row-k-1)){
                    sum = sum + mat[k][l];
                }
            }
        }
        System.out.println(sum);
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
        totalSum(mat);
    }

}
