package patterns2;
import java.util.Scanner;

public class invertedNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        while(i>0){
            int j = 1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
