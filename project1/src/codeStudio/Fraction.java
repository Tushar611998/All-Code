package codeStudio;

import java.util.Scanner;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int num, int deno){
        this.numerator = num;
        this.denominator = deno;
    }
    public Fraction add(Fraction f1,Fraction f2){
        f1.numerator = f2.denominator* f1.numerator + f1.denominator* f2.numerator;
        f1.denominator = f1.denominator* f2.denominator;
        Fraction ans = f1.simplify(f1);
        return ans;
    }
    public Fraction multiply(Fraction f1, Fraction f2){
        f1.numerator = f1.numerator* f2.numerator;
        f1.denominator = f1.denominator*f2.denominator;
        Fraction ans= f1.simplify(f1);
        return ans;
    }
    public Fraction simplify(Fraction f1){
        int i;
        if(f1.numerator< f1.denominator){
            i = f1.numerator;
        }else{
            i = f1.denominator;
        }
        for(int j =2;j<=i;j++){

            if(f1.numerator%j==0 && f1.denominator%j==0){
                f1.numerator = f1.numerator/j;
                f1.denominator = f1.denominator/j;
                j=1;
            }
            if(f1.numerator< f1.denominator){
                i = f1.numerator;
            }else{
                i = f1.denominator;
            }
        }
        return f1;
    }
    public void print(Fraction f){
        System.out.println(f.numerator + "/"+f.denominator);
    }

    // Complete the class

}

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int deno = sc.nextInt();
        Fraction f1 = new Fraction(num,deno);
        int iteration = sc.nextInt();
        for(int i =0;i<iteration; i++){
            int choice = sc.nextInt();
            int num2 = sc.nextInt();
            int deno2 = sc.nextInt();
            Fraction f2 = new Fraction (num2,deno2);
            if(choice==1){
                Fraction ans = f1.add(f1,f2);
                f1.print(ans);
            }else if(choice==2){
                Fraction ans = f1.multiply(f1,f2);
                f1.print(ans);
            }else if(choice==3){
                Fraction ans = f1.simplify(f1);
                f1.print(ans);
            }

        }


        // Write your code here

    }

}
