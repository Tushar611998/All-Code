package Strings;
import java.util.Scanner;
public class removeAllOccurrencesOfChar {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String s = "";
        for (int i =0;i<str.length();i++){
            if(str.charAt(i)==ch){
                continue;
            }
            else{
                s = s+ str.charAt(i);
            }
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        String l = removeAllOccurrencesOfChar(str,ch);
        System.out.println(l);

    }


}
