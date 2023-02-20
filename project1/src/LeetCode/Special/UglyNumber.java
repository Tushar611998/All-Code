package LeetCode.Special;

public class UglyNumber {
    public static boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        while(n>0 && n%5==0){
            n=n/5;
        }while(n>0 && n%3==0){
            n=n/3;
        }while(n>0 && n%2==0){
            n=n/2;
        }

        return n ==1;
    }

    public static void main(String[] args) {
        boolean  ans =isUgly(8);
        System.out.println(ans);

    }
}
