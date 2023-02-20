package LeetCode.Special;

public class FindSqrt {
    public static double squareRoot(int num)
    {
//temporary variable
        double t;
        double sqrtroot=num/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;
    }

    public static void main(String[] args) {
        double ans =squareRoot(16);
        System.out.println(ans);
    }
}
