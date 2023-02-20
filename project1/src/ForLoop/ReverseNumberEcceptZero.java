package ForLoop;
import java.util.Scanner;
// this program ignores all zeros at start and at end and inbetween zeros also


public class ReverseNumberEcceptZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =n; i>0;i=i/10){
            int j = i%10;
            if (j==0){
                continue;
            }
            System.out.print(j);
        }
    }
}
