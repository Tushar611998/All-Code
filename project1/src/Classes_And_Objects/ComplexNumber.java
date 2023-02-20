package Classes_And_Objects;

public class ComplexNumber {
    private int real1;
    private int imaginary1;

    public ComplexNumber(int real1, int imaginary1){
        this.real1 = real1;
        this.imaginary1 = imaginary1;
    }

    public void plus(ComplexNumber c2){
        this.real1 = this.real1 + c2.real1;
        this.imaginary1 = this.imaginary1 + c2.imaginary1;

    }
    public void multiply(ComplexNumber c2){
        int real = this.real1;
         this.real1 = this.real1 * c2.real1 - this.imaginary1 * c2.imaginary1;
        this.imaginary1 = real * c2.imaginary1 + this.imaginary1 * c2.real1;

    }

    public void print(){
        System.out.println(this.real1 + " + "+ "i"+this.imaginary1 );
    }
}
