package Trees;

import java.util.Scanner;

import static Trees.BinaryTreeNodeUse.takingInput;
import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class isBST_2 {

    public static Pair<Boolean,Pair<Integer,Integer>> isBST2(BinaryTreeNode<Integer> root){

        if(root==null){
            Pair<Boolean,Pair<Integer,Integer>> ans = new Pair<>();
            ans.first = true;
            ans.second = new Pair<Integer,Integer>();
            ans.second.first = Integer.MAX_VALUE;
            ans.second.second = Integer.MIN_VALUE;

            return ans;
        }
        Pair<Boolean,Pair<Integer,Integer>> leftAns = isBST2(root.left);
        Pair<Boolean,Pair<Integer,Integer>> rightAns = isBST2(root.right);

        int min = Math.min(root.data,Math.min(leftAns.second.first,rightAns.second.first));
        int max = Math.max(root.data,Math.max(leftAns.second.second,rightAns.second.second));
        boolean isBst = (root.data>leftAns.second.second && root.data<rightAns.second.first)
                && leftAns.first && rightAns.first;

        Pair<Boolean,Pair<Integer,Integer>> ans = new Pair<>();
        ans.first = isBst;
        ans.second = new Pair<Integer,Integer>();
        ans.second.first = min;
        ans.second.second = max;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
        boolean ans = isBST2(root).first;
        System.out.println(ans);

    }
}
