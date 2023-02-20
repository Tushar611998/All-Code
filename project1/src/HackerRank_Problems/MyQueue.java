package HackerRank_Problems;

import java.util.Stack;

public class MyQueue {
    Stack a; Stack b;
    int size;

    public MyQueue() {
        a= new Stack();
        b= new Stack();
        size=0;
    }

    public void push(int x) {
        size++;
        if(!a.isEmpty() && !b.isEmpty()){
            a.push(x);
        }else if(a.isEmpty() && !b.isEmpty()) {
            while(!b.isEmpty()){
                a.push(b.pop());
            }
            a.push(x);
        }else{
            a.push(x);
        }
    }

    public int pop() {
        size--;
        if(a.isEmpty()){
//            while(b.size()>1){
//                a.push(b.pop());
//            }
            return(int) b.pop();
        }
        else {
            while(a.size()>1){
                b.push(a.pop());
            }
            return (int)a.pop();
        }
    }

    public int peek() {
        if(a.isEmpty()){
            return (int)b.get(0);
        }else{
            return (int)a.get(0);
        }

    }

    public boolean empty() {

        return size==0;

    }

}
