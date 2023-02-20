package LeetCode.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        String str ="";
        for(int i =0;i<digits.length;i++){
            str+=digits[i];
        }
        System.out.println(str);
        int countnine = 0;
        if(digits[digits.length-1]==9){
            for(int i=digits.length-1;i>=0;i--){
                if(digits[i]==9){
                    countnine++;
                }else{
                    break;
                }
            }
        }

        int n = str.length();
//        if(str.charAt(n-1)=='9'){
//            n = str.length() +1;
//        }
        int ans []= new int[n];
        int j =0;
        for(;j<n-countnine-1;j++){
//            int a = Integer.parseInt(str.charAt(j));
            ans[j] =(int) str.charAt(j)-'0';
        }
        if(countnine!=0){
            ans[j] = str.charAt(str.length()-1-countnine)+1-'0' ;
            j++;
            for(;j<ans.length-1;j++){
                ans[j] =0;
            }
        }else{
            for(;j<ans.length-1;j++){
                ans[j] =(int) str.charAt(j)-'0';
            }
            int b = str.charAt(str.length()-1)+1-'0';
//            System.out.println(b);
            ans[ans.length-1] = b;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,9,9,9};
        int ans [] = plusOne(arr);
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
