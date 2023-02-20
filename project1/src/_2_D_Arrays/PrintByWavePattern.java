package _2_D_Arrays;
import java.util.Scanner;
public class PrintByWavePattern {
    public static void wavePrint(int mat[][]){
        for(int j = 0; j < mat[0].length;j++){
            if(j%2!=0){
                for(int i = mat.length-1;i>=0;i--){
                    System.out.print(mat[i][j]+ " ");
                }
            }
            if (j%2 ==0){
                for(int i =0;i< mat.length;i++){
                    System.out.print(mat[i][j]+" ");
                }
            }
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
        wavePrint(mat);
    }
}
