package HackerRank_Problems;
import java.util.Scanner;
public class DataFormating {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.next();
        int b = sc.nextInt();
        String c = sc.next();
        int d = sc.nextInt();
        String e = sc.next();
        int f= sc.nextInt();

        System.out.println("================================");
        System.out.printf("%-15s"+"%03d%n",a,b);
        System.out.printf("%-15s"+"%03d%n",c,d);
        System.out.printf("%-15s"+"%03d%n",e,f);
        System.out.println("================================");


    }

}
