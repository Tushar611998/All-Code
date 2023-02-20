package Arrays;
import java.util.Scanner;

public class CreatingArrays {
    public static void main(String[] args) {
        // 1] one way to creat an array is first declaration and then memory allocation

        int [] marks ;                       // declaration
        marks  = new int [5];                //memory allocation

        //2] another one is declaration + memory allocation

        int [] percentage = new int[5];   // declaration then memory allocation

        //3] declaration + memory allocation + initialize values(elements)

        int [] work = {5,10,35,14,23};


        // printing all elements of array

        for (int i=0;i<work.length;i++){
            System.out.print(work[i] + " ");
        }

        // takin input of length of array and also taking input of all elements in array

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int input[] = new int [size];

        for(int i=0;i<size;i++){
            input[i] = sc.nextInt();

        }

        for (int i=0;i<size;i++){
            System.out.print(input[i] + " ");
        }






    }
}
