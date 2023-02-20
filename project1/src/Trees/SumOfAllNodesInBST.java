package Trees;

import java.util.Scanner;

import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class SumOfAllNodesInBST {
    public static int sum(BinaryTreeNode<Integer> root){

        if(root==null){
            return 0;
        }
        int sum =root.data;


        sum+=sum(root.left);
        sum+= sum(root.right);

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
        int ans = sum(root);
        System.out.println(ans);
    }
}
