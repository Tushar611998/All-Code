package LeetCode.LinkedList;

public class MyLinkedListClass {
    int length;
    int data;
    node head;
    node next;

    public MyLinkedListClass() {
        this.head =null;
        this.next= null;
        this.length=0;

    }

    public int get(int index) {
        if(index<0 || index>=length || head== null){
            return-1;
        }
        if(index==0){
            return head.data;
        }
        int count=0;
        node temp =head;
        while(temp.next!= null && count!=index){
            count++;
            temp=temp.next;
        }
        return temp.data;
    }

    public void addAtHead(int val) {
        node n = new node(val);
        if(length==0){
            head = n;
            length++;
            return;
        }
        n.next = head;
        head = n;
        length++;
    }

    public void addAtTail(int val) {
        node n = new node(val);
        if(length==0){
            head=n;
            length++;
            return;
        }
        node temp =head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = n;
        length++;
    }

    public void addAtIndex(int index, int val) {

        if(index<0 || index>length){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==length){
            addAtTail(val);
            return;
        }
        node n = new node(val);
        int count =0;
        node temp =head;
        while(temp.next!=null && count!=index-1){
            count++;
            temp = temp.next;
        }
        // node pre = temp;
        n.next= temp.next;
        temp.next = n;
        length++;
    }

    public void deleteAtIndex(int index) {
        if(index<0 || index>=length){
            return;
        }
        if(index==0){
            head= null;
            length--;
            return;
        }
        if(index==length){
            node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp=null;
            length--;
            return;
        }else{
            int count=0;
            node temp =head;
            node pre = null;
            while(temp.next!=null && count!=index){
                count++;
                pre = temp;
                temp=temp.next;
            }
            pre.next = temp.next;
            length--;
        }

    }
}
class node{
    int data;
//    node head;
    node next;
    public node(int val){
        this.data = val;
//        this.head = null;
        this.next = null;
    }
}
