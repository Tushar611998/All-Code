package Classes_And_Objects;

public class Solution {


    public static void main(String[] args) {

        Adder a = new Adder();
        System.out.println("My superclass is:" + a.getClass().getSuperclass().getName());
        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
