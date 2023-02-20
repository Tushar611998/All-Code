package Arrays;
import java.util.Scanner;

public class INtersectionOf2Arrays {
    public static int [] takingInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        return arr;
    }
    public static void intersection(int arr1[], int arr2[]){

        for (int i = 0;i<arr1.length;i++){
            int temp= arr1[i];

            for(int j =0; j<arr2.length;j++){
                if(arr2[j]==temp && arr2.length==1){

                    System.out.print(arr1[i]+" ");
                    return;
                }
                else if(arr2[j]==temp){

                    System.out.print(arr1[i]+" ");
                    arr2[j]= Integer.MIN_VALUE;
                    break;
                }
                else{continue;}
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int iteration= sc.nextInt();
        int arr1 [] = takingInput();
        int arr2 [] = takingInput();
        intersection(arr1,arr2);
    }
}

