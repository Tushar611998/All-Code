package Strings;
import java.util.Scanner;
public class PrintAllSubstrings04 {
    public static void printSbstrings(String str) {
        for (int length = 1;length<=str.length(); length++){
            // we can pring her as p q r s pq qr rs pqr qrs pqrs
            for (int start = 0;start<=str.length()-length;start++){
                int end = start +length-1;
                System.out.println(str.substring(start,end+1));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSbstrings(str);
    }
}
