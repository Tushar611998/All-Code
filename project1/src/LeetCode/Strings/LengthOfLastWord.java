package LeetCode.Strings;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String str = s.trim();
        int count =0;
        for(int i =str.length()-1;i>0;i--){
            if(str.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;

    }
}
