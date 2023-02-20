package Trees;

import java.util.ArrayList;
import java.util.Scanner;

import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class GetPathToNode_BST {
    public static ArrayList<Integer> getPathToNodeBST(BinaryTreeNode<Integer> root, int data){

        if(root==null){
            return null;
        }

        if(root.data==data){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(root.data);
            return ans;
        }

        if(data<root.data) {
            ArrayList<Integer> newAns = getPathToNodeBST(root.left, data);

            if (newAns != null) {
                newAns.add(root.data);
                return newAns;
            }
        }else if(data>root.data) {

            ArrayList<Integer> op = getPathToNodeBST(root.right, data);
            if (op != null) {
                op.add(root.data);
                return op;
            }
        }
            return null;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
        ArrayList<Integer> ans = getPathToNodeBST(root,6);
        for(int element : ans){
            System.out.print(element + " ");
        }

    }
}
