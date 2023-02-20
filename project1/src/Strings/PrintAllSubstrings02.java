package Strings;

import java.util.Scanner;

public class PrintAllSubstrings02 {
    public static void printSbstrings(String str) {

        for (int i = 0;i<=str.length();i++){
            for(int j =i+1;j<=str.length();j++){
                if (j-i==1){
                    System.out.println(str.substring(i,j));

                }
                else if (j-i==2){
                    System.out.println(str.substring(i,j));

                }
                else if (j-i==3){
                    System.out.println(str.substring(i,j));

                }
                else{
                    System.out.println(str.substring(i,j));

                }
            }

        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSbstrings(str);

    }


}

