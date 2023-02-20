package Arrays;
import java.util.Scanner;
public class LinearSearchWithFunction {
    public static int linearSearch(int arr[],int x) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                num = i;

                return num;

            }


        }
        return -1;
    }
    public static int [] takingInput(){
        Scanner sc = new Scanner(System.in);
        int length =sc.nextInt();
        int arr[] = new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int j []= takingInput();
        int x = sc.nextInt();
        int i =linearSearch(j,x);
        System.out.println(i);



    }

}
