package while_LOOP;

import java.util.Scanner;

public class PrimillityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean isprime = true;
        if (n==0)
            isprime = true;

        if ( n%2==0)
            isprime = false;

        int i = 3;
        while(isprime && i<n){
            isprime =!(n%i==0);
            i+=2;
        }

        if (isprime){
            System.out.println("prime");
        }
        else{
            System.out.println("composite");
        }

    }
}
