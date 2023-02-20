package Trees;

import java.util.ArrayList;
import java.util.Scanner;

import static Trees.BinaryTreeNodeUse.printBinaryTree;
import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class GetPathToNode_BinaryTree {

    public static ArrayList<Integer>  getPathToNode(BinaryTreeNode<Integer> root, int data){

        if(root==null){
            return null;
        }

        if(root.data==data){
            ArrayList<Integer> ans = new ArrayList<>();
             ans.add(root.data);
             return ans;
        }

        ArrayList<Integer> newAns = getPathToNode(root.left,data);

        if(newAns!= null){
            newAns.add(root.data);
            return newAns;
        }

        ArrayList<Integer> op = getPathToNode(root.right,data);
        if(op!=null){
            op.add(root.data);
            return op;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
        ArrayList<Integer> ans = getPathToNode(root,6);
        for(int element : ans){
            System.out.print(element + " ");
        }

    }
}
