package LeetCode.Special;

public class FindSqrtWithBInarySearch {
    public static  int mySqrt(int x) {

        // double sqrt = x/2;
        // double t=sqrt;
        // do{
        //     t = sqrt;
        //     sqrt = (t+(x/t))/2;
        // }while((t-sqrt) != 0);
        // return (int)sqrt;
        int l =1;
        int r = x;
        while(l<=r){
            int mid = (l+r)/2;
            if(x/mid == mid){
                return mid;
            }else if(mid> x/mid){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return r;


    }
    public static void main(String[] args) {
        int ans =mySqrt(16);
        System.out.println(ans);
    }
}
