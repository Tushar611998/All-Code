package Stack;

public class StackUsingArrays {

    private int data[];
    private int top;

    public StackUsingArrays(){
        data = new int[10];
        top = -1;
    }
    public StackUsingArrays(int element){
        data = new int[element];
        top = -1;
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public int size(){
        return top + 1;
    }
    public int pop() throws StackIsEmptyException{
        if(size() == 0){
            // throw stackisEmptyException
            StackIsEmptyException e = new StackIsEmptyException();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }
    public void push(int element) throws StackOverflowException{

        if(size()==data.length){
//            // we have to throw an stackoverflow exception
//            StackOverflowException e = new StackOverflowException();
//            throw e;
           int [] data2 = new int[data.length*2];
            for(int i = 0;i<data.length;i++){
                data2[i] = data[i];
            }
            data = data2;

        }
        top++;
        data[top] = element;
    }

    public int top() throws StackIsEmptyException{
        if(size()==0){
            StackIsEmptyException e = new StackIsEmptyException();
            throw e;
        }
        return data[top];
    }
}
