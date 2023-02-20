package Strings;
import java.util.Scanner;
public class highestOccuringChar_Perfect {
    public static char highestOccuringChar(String str) {
        int freq[] = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        int highest = Integer.MIN_VALUE;
        char ans = str.charAt(0);
        int j;
        for (j = 0; j < str.length();j++){
            if ((freq[str.charAt(j)]) > highest) {
                highest =(freq[str.charAt(j)]);
                ans = str.charAt(j);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char l = highestOccuringChar(str);
        System.out.println(l);



    }

}
