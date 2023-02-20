package DynamicProgramming;

public class MinStepsToOne_Mimoization {

    public static int stepsToOne(int n , int[] storage){
        if(n==1){
            storage[n] =0;
            return storage[n];
        }

        if(storage[n] !=0){
            return storage[n];
        }
        int ans = stepsToOne(n-1,storage);
        int minSteps = ans;
        if(n%3 ==0){
            int ans1 = stepsToOne(n/3,storage);
            if(ans1<minSteps){
                minSteps = ans1;
            }
        }
        if(n%2 ==0){
            int ans2 = stepsToOne(n/2,storage);
            if(ans2<minSteps){
                minSteps = ans2;
            }
        }
        storage[n] = 1+minSteps;
        return storage[n];


    }
    public static int stepsToOne(int n){
        int [] storage = new int[n+1];
        int ans = stepsToOne(n,storage);
        return ans;
    }
    public static void main(String[] args) {
        int n =10;
        int ans = stepsToOne(n);
        System.out.println(ans);
    }
}
