package Trees;

import java.util.Scanner;

import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class IsBST_1 {

    // this program of isBST has worst time complexcity of nlogn for better performance reffer isBST_2

    public static int maximum(BinaryTreeNode<Integer>root){

        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, (Math.max(maximum(root.left),maximum(root.right))));
    }

    public static int minimum(BinaryTreeNode<Integer>root){

        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, (Math.min(minimum(root.left),minimum(root.right))));
    }
    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }

        int leftMax = maximum(root.left);
        int rightmin = minimum(root.right);

        if(root.data<leftMax){
            return false;
        }
        if(root.data>rightmin){
            return false;
        }

        boolean leftBST = isBST(root.left);
        boolean rightBST = isBST(root.right);

        if(leftBST && rightBST){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
        boolean ans = isBST(root);
        System.out.println(ans);
    }
}
