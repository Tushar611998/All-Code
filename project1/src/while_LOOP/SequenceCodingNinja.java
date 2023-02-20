package while_LOOP;
import java.util.Scanner;
public class SequenceCodingNinja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n");
        int n = sc.nextInt();
        System.out.println("enter prev");

        int prev = sc.nextInt();
        int i =1;
        int a=0;
        int b =0;
        boolean decc= true;
        if(n==0){
            System.out.println("false");
            return;
        }

        while(i<n){
            System.out.println("enter curr");
            int curr = sc.nextInt();
            if (curr==prev){
                a=1;
            }
            else if (curr<prev){
                if(decc){
                    prev=curr;
                }
                else if (b==1){
                    a=1;
                }
                else{
                    a=1;
                }
            }
            else if(curr>prev){
                decc =false;
                prev=curr;
                b=1;
            }
            i++;



        }
        if (a==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
