package Trees;

import Queues.QueueIsEmptyEsxception;

import static Trees.BinaryTreeNodeUse.printBinaryTree;

public class BuildTreePostOrder {
    public static BinaryTreeNode<Integer> buildTreeHelper(int []postOrder,int[] inOrder,int postS,int postE,int inS,int inE){

        if(inS>inE){
            return null;
        }

        int rootData  = postOrder[postE];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        int leftInIndex = -1;
        for(int i =inS;i<=inE;i++){
            if( inOrder[i]==rootData){
                leftInIndex = i;
                break;
            }
        }
        if(leftInIndex == -1){
            return null;
        }

        int inLeftS = inS ;
        int inLeftE = leftInIndex -1;
        int postLeftS = postS ;
        int postLeftE = inLeftE - inLeftS + postLeftS;
        int inRightS = leftInIndex + 1;
        int inRightE = inE;
        int postRightS = postLeftE+1;
        int postRightE = postE -1;

        root.left = buildTreeHelper(postOrder,inOrder,postLeftS,postLeftE,inLeftS,inLeftE);
        root.right = buildTreeHelper(postOrder,inOrder,postRightS,postRightE,inRightS,inRightE);

        return root;



    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        return buildTreeHelper(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
        //Your code goes here
    }
    public static void main(String[] args) throws QueueIsEmptyEsxception {
        int[] a = {4,5,2,6,7,3,1};
        int[] b = {4,2,5,1,6,3,7};
        BinaryTreeNode<Integer> root = buildTree(a,b);
        printBinaryTree(root);

    }
}
