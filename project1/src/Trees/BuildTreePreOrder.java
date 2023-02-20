package Trees;

import Queues.QueueIsEmptyEsxception;

import static Trees.BinaryTreeNodeUse.printBinaryTree;

public class BuildTreePreOrder {
    public static BinaryTreeNode<Integer> BinaryTreeNodeHelper(int[] preOrder,int[]inOrder,int preS,int preE,int inS,int inE){
        if(inS>inE){
            return null;
        }

        int rootData = preOrder[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootInIndex = -1;
        for(int i=0;i<=inE;i++){
            if(inOrder[i]==rootData){
                rootInIndex = i;
                break;
            }
        }if(rootInIndex==-1){
            return null;
        }

        int inLeftS = inS;
        int inLeftE = rootInIndex-1;
        int preLeftS = preS + 1;
        int preLeftE = inLeftE - inLeftS + preLeftS;
        int inRightS = rootInIndex + 1;
        int inRightE = inE;
        int preRightS = preLeftE + 1;
        int preRightE = preE;

        root.left = BinaryTreeNodeHelper(preOrder,inOrder,preLeftS,preLeftE,inLeftS,inLeftE);
        root.right = BinaryTreeNodeHelper(preOrder,inOrder,preRightS,preRightE,inRightS,inRightE);

        return root;


    }

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        return BinaryTreeNodeHelper(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
        //Your code goes here
    }

    public static void main(String[] args) throws QueueIsEmptyEsxception {
        int[] a = {4,5,2,6,7,3,1};
        int[] b = {4,2,5,1,6,3,7};
        BinaryTreeNode<Integer> root = buildTree(a,b);
        printBinaryTree(root);

    }


}
