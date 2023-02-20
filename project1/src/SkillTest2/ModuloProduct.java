package SkillTest2;

import java.util.Scanner;

public class ModuloProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteration = sc.nextInt();
        for(int i =0;i<iteration;i++){
            long a = sc.nextInt();
            long b = sc.nextInt();
            if(a>Math.pow(10,7) || b>Math.pow(10,5)){
                System.out.println(0);
                continue;
            }
            a=a%b;
            long ans =1l;
            for(int j =1;j<=a;j++){
//                ans=ans%b;
                ans*=j;
            }
            ans= ans%b;
            System.out.println(ans);


        }
    }
}
