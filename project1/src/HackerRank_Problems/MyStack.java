package HackerRank_Problems;

public class MyStack {
    Q a;
    Q b;
    int size;

    public MyStack() {
        a = new Q();
        b = new Q();
        size=0;
    }

    public void push(int x) {
        size++;
        if(!a.isEmpty()){
            a.push(x);
        }else{
            b.push(x);
        }

    }

    public int pop() {
        size--;
        if(!a.isEmpty()){
            int n = a.size();
            while(n>1){
                b.push(a.pop());
                n--;
            }
            return a.pop();
        }else {
            int n = b.size();
            while (n > 1) {
                a.push(b.pop());
                n--;
            }
            return b.pop();
        }

    }

    public int top() {
        if(a.isEmpty()){
            return b.last();
        }else{
            return a.last();
        }
    }

    public boolean empty() {
        return size==0;
    }
}
