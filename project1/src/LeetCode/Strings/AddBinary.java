package LeetCode.Strings;

public class AddBinary {
    public static String addBinary(String a, String b) {

//         int x = Integer.parseInt(a,2);
//         int y = Integer.parseInt(b,2);
//         int c = x+y;

//         return Integer.toBinaryString(c);
        int x = a.length();
        int y = b.length();
        int k =0;
        long ans1 =0;
        for(int i =x-1;i>=0;i--){
            if(a.charAt(k) =='1'){
                ans1+= 1* Math.pow(2,i);
            }
            k++;
        }
        System.out.println(ans1);

        long ans2 =0;
        k=0;
        for(int i =y-1;i>=0;i--){
            if(b.charAt(k)=='1'){
                ans2+= 1 * Math.pow(2,i);
            }
            k++;
        }
        System.out.println(ans2);

        long ans3 = ans1+ans2;
        System.out.println(ans3);
        String binary = "";
        while(ans3!=0){
            binary = ans3%2 + binary;
            ans3 = ans3/2;
        }
        return binary;

    }

    public static void main(String[] args) {
        String ans = addBinary("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        );
        System.out.println(ans);
    }
}
