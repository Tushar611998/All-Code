import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.*;
public class practice {
//    static String reverseStringWordWise(String input) {
//        String ans="";
//        for(int i=0;i<input.length();){
//            String s ="";
//            while(i<input.length() && input.charAt(i)!=' ' ){
//                s+=input.charAt(i);
//                i++;
//            }
//            ans=s+' '+ans;
//            i++;
//        }
//        return ans;
//        // Write your code here
//    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String ans = reverseStringWordWise(input);
//        System.out.println(ans);
//        int n = sc.nextInt();
//        int count =0;
//        int i =1;
//        while(i<=n){
//            if(n%i==0){
//                count++;
//            }
//        }
//        if (count==2){
//            System.out.println("prime");
//        }else{
//            System.out.println("non prime");
//        }
        StringBuilder ans = new StringBuilder();
        ans.insert(0,1);
        ans.insert(0,5);
        ans.insert(0,10);
        System.out.println(ans);
    }
}
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double amount = sc.nextDouble();
//        sc.close();
//
////        String india1 = NumberFormat.getCurrencyInstance().format(amount);
//
//        String us = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
////        String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(amount);
//        String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(amount);
//        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount);
//        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);
//
//        System.out.println("US: "+ us);
//        System.out.println("India: "+ india);
////        System.out.println("India: "+ india1);
//        System.out.println("China: "+ china);
//        System.out.println("France: "+ france);
//        String a = String.valueOf(NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(amount));
//        System.out.println(a);
//        float amount1 = 100000;
//
//        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
//
//        String moneyString = formatter.format(amount1);
//
//        System.out.println(moneyString);
//        System.out.println(Integer.parseInt("1010",2));
//        System.out.println(Integer.parseInt("1011",2));
//        System.out.println(Integer.toBinaryString(21));
//        System.out.println(Math.pow(2,0));
//        char a1 = sc.next().charAt(0);
//        Character.isAlphabetic('a');
//        int p = 12345;
//       String q = Integer.toString(p);
//       int v = Integer.parseInt(q.valueOf(q.charAt(0)));
//       int ans = q.charAt(3)%2;
//       int a = q.charAt(1) + 5 - '0';
//        System.out.println(a);
        




//    }
//
//
//}
