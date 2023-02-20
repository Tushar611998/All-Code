package LeetCode.Special;

public class AddDigits {
    public static int addDigits(int num) {
        int n =num;
        int fAns=0;
        while(true){
            int ans =0;
            while(n!=0){
                ans+=n%10;
                n = n/10;
            }
            String a = Integer.toString(ans);
            if(a.length()==1){
                fAns = Integer.parseInt(a);
                break;
            }else{
                n = Integer.parseInt(a);
            }
        }
        return fAns;

    }

    public static void main(String[] args) {
        int ans = addDigits(38);
        System.out.println(ans);
    }
}
