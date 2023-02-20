package Classes_And_Objects;

public class Fraction {
    private int neumarator;
    private int denominator;

    public Fraction(int neumarator, int denominator){
        this.neumarator = neumarator;
        this.denominator = denominator;
    }

    public void setNeumarator(int neumarator){
        this.neumarator = neumarator;
        simplify();
    }

    public int getNeumarator(){
        return neumarator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
        simplify();
    }

    public int getDenominator(){
        return denominator;
    }

    private void simplify(){
        if(this.denominator==0){
            // todo error we will see it latter
            return;
        }
        int smaller=Math.min(neumarator,denominator);
//        if(this.neumarator< this.denominator){
//            smaller = this.neumarator;
//        }
//        else if ( this.neumarator> this.denominator){
//            smaller = this.denominator;
//        }

        int gcd =0;
        for(int i=2; i <=smaller;i++){
            if(this.neumarator % i ==0 && this.denominator % i ==0){
                gcd = i;
            }
            else{
                continue;
            }
        }
        if(gcd==0){
            return;
        }
        this.neumarator = neumarator/gcd;
        this.denominator = denominator / gcd;
    }

    public void print() {
//        int a = this.neumarator;
//        int b = this.denominator;
        simplify();
        if (this.denominator == 1) {
            System.out.println(this.neumarator);
        } else {
            System.out.println(this.neumarator + "/" + this.denominator);

        }
    }

    public void add( Fraction f2){
        this.neumarator = this.neumarator * f2.denominator + this.denominator * f2.neumarator;
        this.denominator = this.denominator * f2.denominator;
        simplify();

    }

    public void multiply(Fraction f2){
        this.neumarator = this.neumarator * f2.neumarator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    public static Fraction add(Fraction f1, Fraction f3){
        int num1 = f1.neumarator * f3.denominator + f1.denominator * f3.neumarator;
        int num2 = f1.denominator  * f3.denominator;
        Fraction f = new Fraction(num1,num2);
        return f;

    }


}
