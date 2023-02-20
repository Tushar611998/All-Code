package ifElse;
import java.util.Scanner;

// calculate the income tax for the given income as per income tax slab
// all values of income are in lacs
public class CalculateIncomeTaX {
    public static void main(String[] args) {
        /* income tax slab=
        0 to 2.5 = 0
        2.5 to 5 = 5%
         5 to 10 = 20%
            > 10 = 30%
         */


    Scanner sc = new Scanner(System.in);
    float income = sc.nextFloat();
    float tax = 0;
    if (income <=2.5f){
        tax= tax+0;

    }
    else if (income <=5.0){
        tax = tax + 0.05f* (income - 2.5f);

    }
    else if (income <=10){
        tax = tax + 0.05f * (5 - 2.5f);
        tax = tax+ 0.2f * (income - 5.0f);
    }
    else if (income >10){
        tax = tax + 0.05f * (5-2.5f);
        tax = tax+ 0.2f * (10.0f-5.0f);
        tax = tax + 0.3f *(income -10.0f);
    }
        System.out.println("tax per annum is "+ tax);



}
}
