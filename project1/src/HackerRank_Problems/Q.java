package HackerRank_Problems;

import java.util.LinkedList;
import java.util.List;

public class Q {
    List<Integer> ans;
    public Q(){
        ans = new LinkedList<>();
    }

    public boolean isEmpty(){
        return ans.isEmpty();
    }
    public int size(){
        return ans.size();
    }
    public void push(int data){
        ans.add(data);
    }
    public int front(){
        return ans.get(0);
    }
    public int last(){
        return ans.get(ans.size()-1);
    }
    public int pop(){
        return ans.remove(0);
    }
    public static void main(String[] args) {
//        List<Integer> ans = new LinkedList<>();
//        ans.add(1);
//        ans.add(2);
//        ans.add(3);
//        ans.add(4);
//        ans.add(5);
//        System.out.println(ans.remove(0));
//        System.out.println(ans.get(3));
//        System.out.println(ans.get(ans.size()-1));
        Q ans = new Q();

        System.out.println(ans.isEmpty());
        System.out.println(ans.size());
        ans.push(1);
        ans.push(2);
        ans.push(3);
        ans.push(4);
        ans.push(5);
        System.out.println(ans.front());
        System.out.println(ans.pop());
        System.out.println(ans.size());
        System.out.println(ans.isEmpty());
    }
}
