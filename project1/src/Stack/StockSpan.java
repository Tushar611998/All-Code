package Stack;

public class StockSpan {
    public static int[] stockSpan(int[] price) {

        Sick s = new Sick();
        int ans [] = new int [price.length];

        s.push(0);
        ans[0] = 1;

        for(int i=0;i<price.length;i++){

            while(s.size()!=0 && price[i] > price[s.top()]){
                s.pop();
            }

            if(s.size()!=0){
                ans[i] = i - s.top();
            }else{
                ans[i] = i +1;
            }
            s.push(i);
        }
        return ans;
        //Your code goes here
    }

    public static void main(String[] args) {
        int arr [] = {61,182,154,84,148,28,118,81,169,107,23,1,26,68,95,30,114,58,59,124,56,190,171};
        int ans [] = stockSpan(arr);
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
class Sick{
    private int data[];
    private int top;

    public Sick(){
        data  = new int [10];
        top =-1;
    }

    public int size(){
        return top + 1;
    }
    public void push(int element){
        if(size()==data.length){
            int temp[] = data;
            data = new int [temp.length * 2];
            for(int i = 0;i<temp.length;i++){
                data[i] = temp[i];
            }
        }
        top++;
        data[top] = element;
    }

    public int pop(){
        if(size()==0){
            return-1;
        }
        int temp = data[top];
        top--;
        return temp;
    }

    public int top(){
        if(size()==0){
            return -1;
        }
        return data[top];
    }
}
