package LeetCode.Special;

public class HappyNumber {
//    Write an algorithm to determine if a number n is happy.
//
//    A happy number is a number defined by the following process:
//
//    Starting with any positive integer, replace the number by the sum of the squares of its digits.
//    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//    Those numbers for which this process ends in 1 are happy.
public  static boolean isHappy(int n) {

    int i =25;
    while(i>0){
        String a = Integer.toString(n);
        int ans=0;
        while(n!=0){
            ans += Math.pow(n%10,2);
            n =n/10;
        }
        n =ans;
        if(ans==1){
            return true;
        }else if(ans<1){
            return false;
        }
        i--;
    }
     return false;
}

    public static void main(String[] args) {
        boolean ans =isHappy(25);
        System.out.println(ans);
    }


}
