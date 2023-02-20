package Stack;

public class CheckRedundantBrackets {

    public static boolean checkRedundantBrackets(String expression) {

        int count =0;
        saack s = new saack();
        for(int i = 0;i<expression.length();i++){

            if(expression.charAt(i) == ')'){
                while(s.top() !='('){
                    count++;
                    s.pop();
                }
                if(count>1){
                    count =0;
                    s.pop();
                }else{
                    return true;
                }
            }else{
                s.push(expression.charAt(i));
            }
        }
        return false;
        //Your code goes here
    }

    public static void main(String[] args) {
        String s = "(a+b*(c+d))";
        boolean b = checkRedundantBrackets(s);
        System.out.println(b);
    }
}

class saack {
    private char data [];
    private int top;

    public saack(){
        data = new char [10];
        top = -1;
    }

    public int size(){
        return top + 1 ;
    }

    public char top(){
        if(size()==0){
            return 'z';
        }
        return data[top];
    }

    public void push(char element){
        if(size()==data.length){
            char temp [] = data;
            data = new char[temp.length * 2];
            for(int i =0;i<temp.length;i++){
                data[i] = temp[i];
            }
        }
        top++;
        data[top] = element;
    }

    public char pop(){

        if(size()==0){
            return 'z';
        }
        char temp = data[top];
        top--;
        return temp;
    }

}
