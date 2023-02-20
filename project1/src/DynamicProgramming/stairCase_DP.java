package DynamicProgramming;

public class stairCase_DP {
    public static long stairCaseDP(int n){

        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int storage[] = new int[n+1];
        storage[0] = 1;
        storage[1] = 1;
        storage[2] = 2;

        for(int i =3 ;i<=n;i++){
            storage[i] = storage[i-1] + storage[i-2] + storage[i-3];
        }
        return storage[n];
    }

    public static void main(String[] args) {
        long ans = stairCaseDP(10);
        System.out.println(ans);
    }
}
