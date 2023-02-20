package com.company;

public class third_problem {
    public static void main(String[] args) {
        // encrypt the grades by increasing 8 and also decrypt it by decreasing 8

        // encrypting
        char grade = 'A';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // decrypt
        char grade1 = 'I';
        grade1 = (char)(grade1 -8);
        System.out.println(grade1);

    }
}
