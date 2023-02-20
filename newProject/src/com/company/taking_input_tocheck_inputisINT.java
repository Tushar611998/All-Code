package com.company;
import java.util.Scanner;

public class taking_input_tocheck_inputisINT {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("check number is integer or not");
        boolean a = sc.hasNextInt();
        System.out.println(a);


    }
}
