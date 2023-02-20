package Trees;

public class ConstructLinkedList_Unsolved {
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if(root==null){
            return null;
        }

        LinkedListNode<Integer>  root1 = new LinkedListNode<>(root.data);

        return root1;

    }
    public static LinkedListNode<Integer> helper(BinaryTreeNode<Integer> root){
        if(root==null){
            Pair<LinkedListNode<Integer>,LinkedListNode<Integer>> ans = new Pair<>();
            ans.first = null;
            ans.second= null;
        }
        LinkedListNode<Integer> ans = new LinkedListNode<>(root.data);
         LinkedListNode<Integer>left = helper(root.left);
         ans.next = left;
        LinkedListNode<Integer> right = helper(root.right);
        ans.next= right;

        return ans;





    }

    }
    class LinkedListNode<T>{
    T data;
    LinkedListNode<T> next;
    public LinkedListNode(T data){
        this.data =data;
    }
    }
