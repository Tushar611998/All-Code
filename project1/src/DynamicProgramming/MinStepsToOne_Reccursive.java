package DynamicProgramming;

public class MinStepsToOne_Reccursive {
    public static int countMinStepsToOne(int n) {

        int count =0;
        int ans = count(n,count);
        int ans2 = c2(n);
        return Math.min(ans,ans2);
        //Your code goes here
    }
    public static int c2(int n){
        if(n==1){
            return 0;
        }
        int sa =0;
        if(n%3==0){
            sa += c2(n/3);

        }else if(n%2 == 0){
            if((n-1) %3 ==0){
                sa+=c2(n-1);
            }else {
                sa += c2(n / 2);
            }
        }else{
            sa += c2(n-1);
        }
        return sa + 1;

    }

    public static int count(int n,int count1){
        if(n==1){
            count1++;
            return 0;
        }

        int sa =0;

        // count1+= count(n);
        if(n%3==0){
            count1++;
            sa += count(n/3,count1);

        }else if(n%2 == 0){
            sa += count(n/2,count1);
        }else{
            sa += count(n-1,count1);
        }
        return sa + 1;
    }

    public static void main(String[] args) {
        int n =10;
        int ans = countMinStepsToOne(n);
        System.out.println(ans);
    }
}
