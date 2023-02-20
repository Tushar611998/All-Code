package Strings;
import java.util.Scanner;
public class CountAlphabets {
    public static int countAlphabets(String str) {
        int count = 0;
        for (int i = 0;i<str.length();i++){
            if (Character.isAlphabetic(str.charAt(i))){
                count = count+1;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s = countAlphabets(str);
        System.out.println(s);

    }

}
