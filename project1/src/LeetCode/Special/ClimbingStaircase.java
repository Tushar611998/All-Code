package LeetCode.Special;

public class ClimbingStaircase {
    public static int climbStairs(int n) {
    // this is the question of fibonacci series hence we solve it as same as fibonacci sriese number
        if(n<=1){
            return 1;
        }
        if(n==2){
            return 2;
        }

        int a =1;
        int b =1;
        for(int  i=2;i<=n;i++){
            int c= a+b;
            b =a;
            a=c;
        }
        return a;

    }

    public static void main(String[] args) {
        int ans = climbStairs(4);
        System.out.println(ans);
    }
}
