package LeetCode.Strings;

public class StrStr {
    public static  int strStr(String haystack, String needle) {
        int n = haystack.length();
        for(int i =0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int k =i;

                    for (int j = 0; j < needle.length(); j++) {
                        if(k<n) {
                        if (haystack.charAt(k) != needle.charAt(j)) {
                            break;
                        } else if (j == needle.length() - 1 && haystack.charAt(k) == needle.charAt(j)) {
                            return i;
                        }
                        k++;
                    }
                }
//
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        String a = "mississippi";
        String b = "issipi";
        int ans =strStr(a,b);
        System.out.println(ans);
    }
}
