package Arrays;
import java.util.Scanner;

public class ArrangeArrayWith2Functions {
    public static int [] takingInput(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[]=new int [length];
        if (length%2!=0){
            int val=1;
            for(int i =0;i<=(length-1)/2;i++){
                arr[i]=val;
                val+=2;

            }
            val= length-1;
            for(int i=(length+1)/2; i<length;i++){
                arr[i]=val;
                val-=2;
            }
        }
        else if(length%2==0){
            int val=1;
            for(int i =0;i<=(length-1)/2;i++){
                arr[i]=val;
                val+=2;

            }
            val= length;
            for(int i=(length+1)/2; i<length;i++){
                arr[i]=val;
                val-=2;
            }

        }
        return arr;
    }
    public static void print(int arr[]){
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int arr[]= takingInput();
        print(arr);
    }

}
