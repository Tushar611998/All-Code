package _2_D_Arrays;
import java.util.Scanner;
public class Input_2_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total no. of rows");
        int rows = sc.nextInt();

        System.out.println("Enter total no. of cols");
        int cols = sc.nextInt();

        int Array2D[][] =  new int [rows][cols];

        for(int i = 0;i<rows;i++){
            for(int j =0;j<cols;j++){
                System.out.println("Enter element at row "+ i + " & col " + j);
                Array2D[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<rows;i++){
            for(int j =0;j<cols;j++){
                System.out.print(Array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Array2D[0].length);

    }
}
