package Trees;
import Queues.QueueIsEmptyEsxception;

import javax.print.attribute.IntegerSyntax;
import java.util.*;
public class BinaryTreeNodeUse {



    public static int countNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int count = 1;
        count+= countNodes(root.left);
        count+= countNodes(root.right);

        return count;
    }
    public static BinaryTreeNode<Integer> takingInputLevelWise(Scanner s){

        System.out.println("enter root data");
        int rootData = s.nextInt();
        if(rootData==-1){
            return null;
        }
        QueueWithLL <BinaryTreeNode<Integer>> pendingNode = new QueueWithLL<>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNode.enqueue(root);
        while(!pendingNode.isEmpty()){
            try {
                BinaryTreeNode<Integer> ans = pendingNode.dequeue();
                System.out.println("enter left element of " + ans.data);
                int leftData = s.nextInt();
                if(leftData!=-1){
                    BinaryTreeNode<Integer> left = new BinaryTreeNode<>(leftData);
                    pendingNode.enqueue(left);
                    ans.left = left;
                }

                System.out.println("enter right element of " + ans.data);
                int rightData = s.nextInt();
                if(rightData!=-1){
                    BinaryTreeNode<Integer> right = new BinaryTreeNode<>(rightData);
                    pendingNode.enqueue(right);
                    ans.right = right;
                }

            } catch (QueueIsEmptyEsxception e) {
                return null;
            }
        }
        return root;

    }

    public static BinaryTreeNode<Integer>  takingInput(Scanner s){
        System.out.println("enter root data");
        int rootData = s.nextInt();

        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
//        System.out.println("enter left of root");
        root.left = takingInput(s);
        root.right = takingInput(s);

        return root;
    }

    public static void printBinaryTree(BinaryTreeNode<Integer>root){
        if(root==null){
            return;
        }
        String s = root.data + ":-";
        if(root.left!=null){
            s+= "L:" + root.left.data + ",";
        }
        if(root.right!=null){
            s+= "R:" + root.right.data + ",";
        }
        System.out.println(s);
        printBinaryTree(root.left);
        printBinaryTree(root.right);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
        int totalNodes = countNodes(root);
        System.out.println(totalNodes);
//        printBinaryTree(root);
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
//        root.left = node1;
//        BinaryTreeNode<Integer> node2= new BinaryTreeNode<>(2);
//        root.right = node2;
    }
}
