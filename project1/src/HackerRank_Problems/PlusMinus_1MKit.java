package HackerRank_Problems;
import java.util.Scanner;
public class PlusMinus_1MKit {
    public static void plusminus(int arr[]) {
        float countplus = 0;
        float countminus = 0;
        float countzero = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                countzero= countzero +1;
            }
            else if(arr[i]>0){
                countplus = countplus +1;
            }
            else if(arr[i]<0){
                countminus = countminus +1;
            }

        }
        float plusratio = countplus/arr.length;
        float minusratio = countminus/arr.length;
        float zeroratio = countzero/arr.length;

//        System.out.print(plusratio + " "+ minusratio+" "+ zeroratio + " ");

        System.out.printf("%.6f%n%.6f%n%.6f%n", plusratio, minusratio,zeroratio);
    }

}
class solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        PlusMinus_1MKit p = new PlusMinus_1MKit();
        p.plusminus(arr);

    }
}
