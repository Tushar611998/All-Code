package LeetCode.Strings;

import java.util.Stack;

public class ValidParenthessis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }else if(s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }else if(s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(st.isEmpty() || st.pop()!='('){
                    return false;
                }
            }else if(s.charAt(i) == '}'){
                if(st.isEmpty() || st.pop()!='{'){
                    return false;
                }
            }else if(s.charAt(i) == ']'){
                if(st.isEmpty() || st.pop()!='['){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
}
