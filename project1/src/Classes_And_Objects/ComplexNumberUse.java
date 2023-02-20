package Classes_And_Objects;
import java.util.Scanner;
public class ComplexNumberUse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter real1");
        int real1 = sc.nextInt();
        System.out.println("enter imaginary1");
        int imaginary1 = sc.nextInt();

        System.out.println("enter real2");
        int real2 = sc.nextInt();
        System.out.println("enter imaginary2");
        int imaginary2 = sc.nextInt();

        ComplexNumber c1 = new ComplexNumber(real1, imaginary1);
        ComplexNumber c2 = new ComplexNumber(real2, imaginary2);
        System.out.println("enter choiceNumber 1 or 2");
        int choice = sc.nextInt();

        if(choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        }
        else if(choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        }
        else {
            return;
        }

    }
}
