package Special;

import java.util.Scanner;

public class solve {
    public static boolean checkSequence(String a, String b) {

        int index = -1;
        int preindex = -2;
        for (int i = 0; i < b.length(); i++) {
            for (int j = index+1; j < a.length(); j++) {
                if (b.charAt(i) == a.charAt(j)) {
                    index = j;
                    if (index > preindex) {
                        preindex = index;
                        break;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean ans = checkSequence(a,b);
        System.out.println(ans);
    }
}
