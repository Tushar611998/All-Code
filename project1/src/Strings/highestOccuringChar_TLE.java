package Strings;
import java.util.Scanner;
public class highestOccuringChar_TLE {
    // Time limit exceeded for this program check its optimized better version
    public static char highestOccuringChar(String str) {
        int highest = Integer.MIN_VALUE;
        char a = str.charAt(0);
        for (int i = 0;i<str.length();i++){
            int count =1;
            for (int j = i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count = count +1;
                }
                if ( count > highest){
                    highest = count;
                    a = str.charAt(i);

                }
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
