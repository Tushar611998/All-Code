package Classes_And_Objects;

public class DynamicArray {
    private int data[];
    private int nextIndex;

    public DynamicArray(){
        this.data = new int[5];
        this.nextIndex = 0;
    }

    public void add(int element){

        if(element == 0){
            return;
        }
        if(nextIndex<5){

            data[nextIndex] = element;
            this.nextIndex++;
        }
        else if(nextIndex==data.length){
            rearrange();
            data[nextIndex]= element;
            this.nextIndex++;
        }
        else{
            data[nextIndex]= element;
            this.nextIndex++;
        }
    }

    private void rearrange(){
        int arr [] = this.data;
        data = new int[data.length * 2];
        for(int i =0;i<arr.length;i++){
            data[i]=arr[i];
        }
    }
    public void print(){
        for (int i =0;i<this.nextIndex;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public int size(){
        return nextIndex;
    }

    public void set(int Index, int element){
        if (Index >this.nextIndex) {
            return;
        }
        if(Index <this.nextIndex){
            data[Index] = element;
        }
        else{
            add(element);
        }
    }
    public int get(int index){
        if(index <nextIndex) {
            return data[index];
        }
        else{
            return -1;
        }
    }

    public int removeLast(){
        if(nextIndex==0){
            return -1;
        }

        int temp = data[nextIndex-1];
        data[nextIndex-1] = 0;
        nextIndex--;
        return temp;

        }
    }
