package DynamicProgramming;

public class MinCountOfSquares_Memoization {
    public static int minCount(int n,int[] storage){
        if(n==0){
            storage[n] = n;
            return storage[n];
        }
        if(n==1){
            storage[n] = n;
            return storage[n];
        }

        if(storage[n]!=0){
            return storage[n];
        }
        int min = Integer.MAX_VALUE;
        for(int i =1;i<=Math.sqrt(n);i++){
            int ans = minCount(n-(i*i),storage);
            if(ans<min){
                min = ans;
            }
        }
        storage[n] = min+1;
        return storage[n];
    }
    public static void main(String[] args) {
        int n =12;
        int [] storage = new int[n+1];
        int ans = minCount(n,storage);
        System.out.println(ans);
    }
}
