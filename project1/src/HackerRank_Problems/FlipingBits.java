package HackerRank_Problems;

public class FlipingBits {
    public static long flippingBits(long n) {

        String a = Long.toBinaryString(n);
        int count =0;
        for(int i =0;i<a.length();i++){
            count++;
        }
        for(int i =0;i<(32-count);i++){
            a="0" + a;
        }

        System.out.println(a);
        String ans ="";

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='0'){
                ans+="1";
            }else if(a.charAt(i)=='1'){
                ans+="0";
            }
        }
        System.out.println(ans);
        return Long.parseLong(ans,2);
        // Write your code here
//        return 0;

    }


    public static void main(String[] args) {
//        List<Integer> ans = new ArrayList<>();
//        System.out.println(Integer.parseInt("1001",2));
//        System.out.println(Integer.toBinaryString(9));
//        System.out.println(Long.toBinaryString(5));
        long ans = flippingBits(1);
        System.out.println(ans);
    }
}
