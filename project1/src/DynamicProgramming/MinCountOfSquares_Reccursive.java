package DynamicProgramming;

public class MinCountOfSquares_Reccursive {
    public static int minCount(int n){
        if(n==0){
            return 0;
        }
        if (n == 1) {

            return 1;
        }
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=Math.sqrt(n);i++){
            int ans = minCount(n-(i*i));
            if(ans<min){
                min =ans;
            }
        }
        return min+1;
    }

    public static void main(String[] args) {
        int ans = minCount(12);
        System.out.println(ans);
    }
}
