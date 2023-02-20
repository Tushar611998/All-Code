package Arrays;
import java.util.Scanner;
public class FindTripletsOfSumX {
    public static int[] takingInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    public static int triplets(int arr[], int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            for (int j = i+1; j < arr.length-1; j++) {

                int num= temp + arr[j];
                for(int k =j+1;k<arr.length;k++){

                    if(num+arr[k]==x){
                        count=count+1;
                    }
                    else{
                        continue;
                    }



                }

            }
        }
        return count;
    }


    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        int arr[] = takingInput();
        int x = sc.nextInt();
        int j = triplets(arr,x);
        System.out.println(j);


    }
}


