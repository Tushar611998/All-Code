package DynamicProgramming;

public class FibonacciMemoization {

    public static int fibo(int n , int[] arr){
        if(n==0 || n ==1){
            arr[n] = n;
            return n;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        return fibo(n-1,arr) + fibo(n-2,arr);
    }

    public static void main(String[] args) {
        int n = 40;
        int [] arr = new int[n+1];
        for (int i = 0;i<arr.length;i++){
            arr[i] = -1;
        }
        int ans = fibo(n,arr);
        System.out.println(ans);
    }
}
