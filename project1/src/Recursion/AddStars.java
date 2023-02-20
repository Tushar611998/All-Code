package Recursion;
import java.util.Scanner;
public class AddStars {

    public static String addStars(String s) {
        return addStars(s,0);
    }
    public static String addStars(String s,int startIndex){

        if(startIndex==s.length()-1){
            String a = "";
            a = s.charAt(s.length()-1) +a;
            return a;
        }
        String smallans = addStars(s,startIndex+1);
        if(s.charAt(startIndex)==s.charAt(startIndex+1)){
            smallans =   s.charAt(startIndex) +"*"+smallans;
            }
        else{
            smallans=s.charAt(startIndex)+smallans;
        }
        return smallans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = addStars(s);
        System.out.println(a);
    }
}
