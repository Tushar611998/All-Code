package ForLoop;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;

        int j =2;
        int power = 1;
        for(int i=n;i>0 ;i=i/10){
            sum = sum+((i%10)*power);
            power=power*j;
        }
        System.out.println(sum);

    }
}
