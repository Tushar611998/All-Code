package Classes_And_Objects;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(20,30);
        f1.print();

        f1.setNeumarator(12);
        int d =f1.getDenominator();
        System.out.println("denominator :" + d);
        System.out.print("f1 is :");
        f1.print();

        f1.setNeumarator(10);
        f1.setDenominator(30);
        System.out.print("f1 is :");
        f1.print();

        Fraction f2 = new Fraction(3,4);
        f1.add(f2);
        System.out.print("f1 is :");
        f1.print();
        System.out.print("f2 is :");
        f2.print();

        Fraction f3 = new Fraction(4,5);
        f3.multiply(f2);
        System.out.print("f3 is :");
        f3.print();
        System.out.print("f2 is :");
        f2.print();


        Fraction f4 = Fraction.add(f1,f3);
        System.out.print("f1 is :");
        f1.print();
        System.out.print("f3 is :");
        f3.print();
        System.out.print("f4 is :");
        f4.print();

    }
}
