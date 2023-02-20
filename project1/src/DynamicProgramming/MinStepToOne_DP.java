package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;

public class MinStepToOne_DP {
    public static int stepsToOneDP(int n){
        int storage [] = new int[n+1];
        storage[1] = 0;
        for(int i =2;i<=n;i++){
            int min  = storage[i-1];
            if(n%3 ==0){
                if(min> storage[i/3]){
                    min = storage[i/3];
                }
            }
            if(n%2 ==0){
                if(min> storage[i/2]){
                    min = storage[i/2];
                }
            }
            storage[i] = 1 + min;
        }
        return storage[n];

    }


    public static void main(String[] args) {
        int n = 10;
        int ans = stepsToOneDP(n);
//        int ans2 = count2(n);
//        System.out.println(Math.min(ans,ans2));
        System.out.println(ans);

    }
}
