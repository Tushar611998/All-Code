package com.company;

import java.util.Scanner;
public class booleanoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 25;
        int y = 50;
        String a = sc.nextLine();
        String b = "hello worlld";

        char d = sc.next().charAt(0);


        System.out.println(x>y);
        System.out.println(x<y);
        String result = a.toUpperCase();
        System.out.println(result);
        System.out.println(Integer.SIZE);
        System.out.println(Float.SIZE);
        System.out.println(Double.SIZE);
        System.out.println(Character.SIZE);
        System.out.println(Short.SIZE);
        System.out.println(Long.SIZE);
        System.out.println(Byte.SIZE);

        System.out.println(Integer.MAX_VALUE);



    }
}
