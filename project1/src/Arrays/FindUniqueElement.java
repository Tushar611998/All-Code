package Arrays;
import java.util.Scanner;
public class FindUniqueElement {
    public static int [] takingInput(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0;i<n;i++){
            arr[i]= sc.nextInt();

        }
        return arr;
    }
    public static int unique(int arr[]){
        int num=0;
        for (int i = 0;i<arr.length;i++){
            int temp= arr[i];

            for(int j =0; j<arr.length;j++){
                if (arr.length==1){
                    return arr[i];
                }
                else if (j== arr.length-1 && i==j){
                    num = arr[i];
                    return num;
                }
                else if(i==j){
                    continue;
                }
                else if(arr[j]==temp){
                    break;
                }

                else if (j== arr.length-1){
                    num = arr[i];
                    return num;
                }
                else{continue;}
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int iteration= sc.nextInt();
        int arr [] = takingInput();
        int j =unique(arr);
        System.out.println(j);


    }


}

