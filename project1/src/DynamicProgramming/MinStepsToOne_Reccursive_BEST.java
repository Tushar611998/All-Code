package DynamicProgramming;

public class MinStepsToOne_Reccursive_BEST {

    public static int StepsToOne(int n){
        if(n==1){
            return 0;
        }

        int ans = StepsToOne(n-1);
        int minStep = ans;
        if(n%3 == 0){
            int ans1 = StepsToOne(n/3);
            if(ans1<minStep){
                minStep = ans1;
            }
        }
        if(n%2 ==0){
            int ans2 = StepsToOne(n/2);
            if(ans2<minStep){
                minStep = ans2;
            }
        }
        return 1+ minStep;
    }
    public static void main(String[] args) {
        int n =10;
        int ans = StepsToOne(n);
        System.out.println(ans);
    }
}
