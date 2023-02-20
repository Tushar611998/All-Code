package Strings;
import java.util.Scanner;
public class removeConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        String s = "";

        for (int i = 0;i <str.length();i++){
            if(i==0){
                s = s+ str.charAt(i);
            }
            else if (str.charAt(i)!=str.charAt(i-1)){
                s =s + str.charAt(i);
            }

        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String l = removeConsecutiveDuplicates(str);
        System.out.println(l);

    }

}
