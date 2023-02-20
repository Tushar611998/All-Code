package Strings;
import java.util.Scanner;
public class CountWords {
    public static int countWords(String str) {
        if (str.length()==0){
            return 0;
        }
        int count = 1;
        for (int i = 0;i<str.length();i++){
            if (Character.isSpace(str.charAt(i))){
                count = count+1;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s = countWords(str);
        System.out.println(s);

    }

}
