package Strings;
import java.util.Scanner;
public class PrintAllSubstrings03 {
    public static void printSbstrings(String str) {
        int i = 0;
        int j = i+1;
        while(i<=str.length() && j <=str.length()){
            System.out.println(str.substring(i,j));
            i++;
            j++;
        }                                   // or else we can write new fuction for while loop
                                           // and use it in the function
        i=0;
        j =i+2;
        while(i<=str.length() && j <=str.length()){
            System.out.println(str.substring(i,j));
            i++;
            j++;
        }
        i=0;
        j=i+3;
        while(i<=str.length() && j <=str.length()){
            System.out.println(str.substring(i,j));
            i++;
            j++;
        }
        System.out.println(str.substring(0));



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSbstrings(str);

    }



}
