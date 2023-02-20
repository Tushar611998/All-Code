package LeetCode.Strings;

import java.util.HashMap;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }

        HashMap<Character,Character> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(map.containsValue(t.charAt(i))){
                continue;
            }else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }

        StringBuilder a = new StringBuilder();
        for(int i=0;i<s.length();i++){
            a.append(map.get(s.charAt(i)));
        }

        return (a.toString().equals(t));
    }

    public static void main(String[] args) {
        String a ="paper";
        String b ="title";
        boolean ans = isIsomorphic(a,b);
        System.out.println(ans);
    }
}
