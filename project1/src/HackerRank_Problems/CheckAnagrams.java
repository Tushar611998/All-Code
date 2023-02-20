package HackerRank_Problems;
import java.util.Scanner;
import java.util.Arrays;
public class CheckAnagrams {
    public static void main(String[] args) {
        int[] arr1 = new int [255];
        int [] arr2 = new int[255];

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 =  sc.next();
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        for(int i =0 ; i <s1.length();i++){
            arr1[s1.charAt(i)]++;
        }
        for(int i =0 ; i <s2.length();i++){
            arr2[s2.charAt(i)]++;
        }

//         for(int i =0 ; i <255;i++){
//             System.out.print(arr1[i]+" ");
//         }
//        System.out.println();
//
//        for(int i =0 ; i <255;i++){
//            System.out.print(arr2[i]+" ");
//        }

        if ( Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }


    }
}
