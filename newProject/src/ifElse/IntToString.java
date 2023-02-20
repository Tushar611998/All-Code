package ifElse;
import java.util.Scanner;

public class IntToString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (-100<=n && n<=100){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}

