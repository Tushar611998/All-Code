package Trees;
import java.util.*;

import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class DiameterOfBinaryTree {
    public static Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){

        if(root==null){
            Pair<Integer,Integer> ans = new Pair<>();
            ans.first = 0;
            ans.second =0;
            return ans;
        }

        Pair<Integer,Integer> ans1 = heightDiameter(root.left);
        Pair<Integer,Integer> ans2 = heightDiameter(root.right);
        int height =1 + Math.max(ans1.first,ans2.first);
        int option1 = ans1.first + ans2.first;
        int option2 = ans1.second;
        int option3 = ans2.second;
        int diameter = Math.max(option1,Math.max(option2,option3));
        Pair<Integer,Integer> ans = new Pair<>();
        ans.first = height;
        ans.second =diameter;
        return ans;

    }
    public static int diameter(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int height1 = height(root.left) + height(root.right);
        int height2 =diameter(root.right);
        int height3 =diameter(root.right);
        return Math.max(height1,Math.max(height2,height3));




    }

    private static int height(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        int height =0;
        int count =1;
        int ans = count + height(root.left);
        int ans2 = count + height(root.right);

        if(ans>ans2){
            return ans;
        }else{
            return ans2;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
//        int h = height(root);
//        int ans = diameter(root);
        Pair<Integer,Integer> ans1 = heightDiameter(root);
        System.out.println(ans1.second);
    }
}
