package HackerRank_Problems;

public class MyQueueUse {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        System.out.println(q.empty());
//        System.out.println(q.pop());
        System.out.println(q.peek());
//        int b = q.pop();
        System.out.println(q.pop());
        System.out.println(q.pop());
        q.push(5);
//        int a = q.pop();
        System.out.println(q.pop());

    }
}
