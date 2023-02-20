package ifElse;
import java.util.Scanner;

public class FIndTypesOfWebsites {
    public static void main(String[] args) {
        // problem statement=
        // find out the type of websites=
        // .org - orgnizational website
        //.in  - indian website
        //.com - commertial website

        Scanner sc = new Scanner (System.in);
        String website = sc.next();

        if (website.endsWith(".org")){
            System.out.println("the website is orgnizational");

        }
        else if (website.endsWith(".in")){
            System.out.println(" website is indian");
        }
        else if (website.endsWith(".com")){
            System.out.println("website is commertial");
        }


    }
}
