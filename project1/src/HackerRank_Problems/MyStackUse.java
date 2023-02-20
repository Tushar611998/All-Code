package HackerRank_Problems;

public class MyStackUse {
    public static void main(String[] args) {
        MyStack ans = new MyStack();
        ans.push(1);
        ans.push(2);
        ans.push(3);
        ans.push(4);
        ans.push(5);
        int a = ans.pop();
        System.out.println(a);
        System.out.println(ans.empty());
        System.out.println(ans.pop());
        System.out.println(ans.pop());
    }
}
