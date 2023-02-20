package Recursion;
import java.util.Scanner;
public class QuickSort {
    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }
    private static void quickSort(int[] input, int startIndex, int endInedx) {

        if(startIndex>=endInedx){
            return;
        }

        int pivotpos = partition(input,startIndex,endInedx);
        quickSort(input,startIndex,pivotpos-1);
        quickSort(input,pivotpos+1,endInedx);

    }
    private static int partition(int[] input,int startIndex,int endInedx){

        // count the elements which are less than 1st element
        int count =0;
        for(int i =startIndex+1;i <=endInedx;i++){
            if(input[startIndex]>=input[i]) {
                count = count + 1;
            }
        }
        int pivotpos = startIndex+count;
        //swap the 1st element to its apropriate position and declare it as pivot point
        int element = input[startIndex];
        input[startIndex]= input[pivotpos];
        input[pivotpos] = element;

        //make sure that all elements left to pivot are less than pivot
        // and at right all the elements should be greater than pivot.
        int i =startIndex;
        int j = endInedx;
        while(i<pivotpos && j >pivotpos){
            if(input[i]<= input[pivotpos]){
                i++;
            }
            else if(input[j]> input[pivotpos]){
                j--;
            }
            else{
                element = input[i];
                input[i]=input[j];
                input[j] = element;
                i++;
                j--;

            }

        }
        return pivotpos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        quickSort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
