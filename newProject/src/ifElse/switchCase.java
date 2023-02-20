package ifElse;
import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int age = sc.nextInt();

        switch (age){
            case 18 :
                System.out.println("you are eligible for driving licence");
                break;
            case 21 :
                System.out.println("you are allowed for liqquor");
                break;
            default :
                System.out.println("life is beautifull, enjoy life");
                break;

        }


    }
}
