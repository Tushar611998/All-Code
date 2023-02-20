package Strings;

import java.util.Arrays;
import java.util.Scanner;
public class highestOccuringChar_All_TLE {

    //this program performs well only  test cases

    public static char highestOccuringChar(String str) {
        int highest = Integer.MIN_VALUE;
        char b [] = str.toCharArray();
        int i =0;
        char a = b[i];
        Arrays.sort(b);
        int index = 0;

        for (;i<b.length;i= index){
            int count =0;
            for(int j = i +1;j<b.length;j++) {
                if (b[i] == b[j]) {
                    count = count + 1;
                }
                else {
                    index = j;
                    break;
                }
                if (count > highest) {
                    highest = count;
                    a = b[i];
                }

            }
            if(i==b.length-1){
                break;
            }


        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char l = highestOccuringChar(str);
        System.out.println(l);



    }

}
