package Stack;
import java.util.Arrays;

public class BalancedParenthesis {

    public static boolean isBalanced(String expression) {
        char arr[] = expression.toCharArray();

        Stack Stack = new Stack();
        int open =0;

        for(int i =0;i< arr.length;i++){
            if(arr[i]=='{'){
                Stack.push(arr[i]);
                open++;
            } else if(arr[i]=='['){
                Stack.push(arr[i]);
                open++;
            } else if(arr[i]=='('){
                Stack.push(arr[i]);
                open++;
            }
            else if(arr[i]=='}' && Stack.top() == '{'){
                Stack.pop();
                open--;
            }
            else if(arr[i]==']' && Stack.top() == '[' ){
                Stack.pop();
                open--;
            }
            else if(arr[i]==')' && Stack.top() == '('){
                Stack.pop();
                open--;
            }
            else{
                return false;
            }
        }
        if(open==0) {
            return true;
        }
        return false;



        //Your code goes here
    }

    public static void main(String[] args) {
        String s = "()()(()";
        boolean b = isBalanced(s);
        System.out.println(b);

    }
}
class Stack {

    private  char[] data;
    private  int top;

    //Define the data members


    public Stack() {

        data = new char[10];
        top = -1;
        //Implement the Constructor
    }



    /*----------------- Public Functions of Stack -----------------*/


    public  int Size() {
        return top+1;
        //Implement the getSize() function
    }

    public boolean isEmpty() {
        return (Size()==0);
        //Implement the isEmpty() function
    }

    public void push(int element) {

        if(Size()==data.length){
            char temp [] = data;

            data = new char[temp.length*2];
            for(int i =0;i < temp.length;i++){
                data[i] = temp[i];
            }
        }
        top++;
        data[top] = (char)element;

        //Implement the push(element) function
    }

    public int pop() {
        if(Size()==0){
            return -1;
        }
        int temp = data[top];
        top--;
        return temp;


        //Implement the pop() function
    }

    public int top() {
        if(Size()==0){
            return -1;
        }
        return data[top];
        //Implement the top() function
    }

}


