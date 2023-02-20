package com.company;
import java.util.Scanner;
public class taking_string_as_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter integer value");
        int i = sc.nextInt();
        System.out.println("enter double value");
        double d = sc.nextDouble();
        System.out.println("enter String");
        String s = sc.nextLine();
        s = sc.nextLine();
        System.out.println("String: " + s);
        System.out.println("double: " + d);
        System.out.println("integer: " + i);
    }
}
