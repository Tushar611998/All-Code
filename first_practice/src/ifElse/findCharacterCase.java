package ifElse;
import java.util.Scanner;


public class findCharacterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  char name = sc.next().charAt(0);
        if (Character.isUpperCase(name)){
            System.out.println(1);
        }
        else if (Character.isLowerCase(name)){
            System.out.println(0);

        }
        else{
            System.out.println(-1);
        }
        Scanner sc = new Scanner(System.in);*/

        char name = sc.next().charAt(0);

        if (Character.isUpperCase(name)){
            System.out.println(1);
        }

        else if (Character.isLowerCase(name)){
            System.out.println(0);
        }

        else{
            System.out.println(-1);
        }

    }
}
