package Stack;

public class StackUsingLinkedListUse {
    public static void main(String[] args) {
        StackUsingLinkedLIst  s = new StackUsingLinkedLIst();
        for(int i =0;i<11;i++){
            s.push(i);
        }
        for(int i =0;i<11;i++){
            System.out.println( s.pop());
        }
    }



}
