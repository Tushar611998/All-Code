package DynamicProgramming;

public class StairCase_Recursive {
    public static long stairCase(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return stairCase(n-1) + stairCase(n-2) + stairCase(n-3);
    }

    public static void main(String[] args) {
        long ans = stairCase(10);
        System.out.println(ans);
    }
}
