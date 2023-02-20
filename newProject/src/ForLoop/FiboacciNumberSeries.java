package ForLoop;
import java.util.Scanner;

public class FiboacciNumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int a= 1;
        int b=1;
        int c;
        int sum = 0;

        for(int i =1 ;i<=n;i++){
            sum=a;
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(sum);



    }
}

