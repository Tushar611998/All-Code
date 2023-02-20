package while_LOOP;
import java.util.Scanner;

public class Test1_ckeckArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int i =n;
        int count = 0;
        while(i>0){

            count=count+1;
            i=i/10;
        }


        int sum=0;
        i=n;
        while(i>0){
            int j=1;
            int k = i % 10;
            int s =k;

            while(j<count) {

                s=s*k;
                j++;
            }
            sum = sum + s;
            i=i/10;



        }
        if (n==sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
