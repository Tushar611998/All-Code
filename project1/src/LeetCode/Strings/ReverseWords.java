package LeetCode.Strings;

public class ReverseWords {
    public static String reverseWords(String s) {
//        String a = s.trim();
        String a = s.replaceAll("\\s+"," ");

        String ans = "";
        for(int i =0;i<a.length();i++){
            String smallAns = "";
            while(i!=a.length() && a.charAt(i)!=' '){
                smallAns+=a.charAt(i);
                i++;
            }
            if(ans.length()==0){
                ans=smallAns+ans;
            }else{
                ans= smallAns+" "+ans;
            }
            // i++;
        }
        return ans;

    }

    public static void main(String[] args) {
        String a = "  hello   world  !!";
        String ans = reverseWords(a);
        System.out.println(ans);
    }
}
