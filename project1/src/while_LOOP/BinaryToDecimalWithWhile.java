package while_LOOP;
import java.util.Scanner;

public class BinaryToDecimalWithWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int i =n;
        int j =2;
        int power = 1;
        while(i>0){
            sum = sum+((i%10)*power);
            power=power*j;
            i=i/10;
        }
        System.out.println(sum);

    }
}
