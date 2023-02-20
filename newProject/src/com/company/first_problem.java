package com.company;
import java.util.Scanner;
public class first_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // calculate the percentage of students marks obtained in 5 subjects out of 100
        System.out.println("Enter marks obtained in maths");
        int a = sc.nextInt();
        System.out.println("Enter marks obtained in science");
        int b = sc.nextInt();
        System.out.println("Enter marks obtained in English");
        int c = sc.nextInt();
        System.out.println("Enter marks obtained in HIstory");
        int d = sc.nextInt();
        System.out.println("Enter marks obtained in Geography");
        int e = sc.nextInt();
        System.out.println("Enter total outoff marks");
        int f = sc.nextInt();
        System.out.println("Enter outoff percentage");
        int g = sc.nextInt();
        float percentage = (((float)a+b+c+d+e)*g)/f;
        System.out.println("percentage %");
        System.out.println(percentage);
    }
}
