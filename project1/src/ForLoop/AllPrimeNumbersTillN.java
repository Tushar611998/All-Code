package ForLoop;
import java.util.Scanner;

public class AllPrimeNumbersTillN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count=count+1;
                }
            }
            if(count==2){
                System.out.println(i);

            }
        }
    }
}
