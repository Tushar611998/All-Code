package Trees;

import java.util.Scanner;

import static Trees.TreeNodeUSse.takingInputLevelWise;

public class MaxSumOfChildren {
    public static int sumOfNodes(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int sum = root.data;
        for(int i = 0;i<root.children.size();i++){
            sum = sum + root.children.get(i).data;
        }
        return sum;

    }

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        if(root==null){
            return root;
        }

        int newAns = sumOfNodes(root);
        int maxSum = Integer.MIN_VALUE;
        TreeNode<Integer> finalans = null;

        for(int i = 0;i<root.children.size();i++){

            TreeNode<Integer> ans = maxSumNode(root.children.get(i));
            int sum = sumOfNodes(ans);
            if(maxSum<sum){
                maxSum=sum;
                finalans=ans;
//                return  finalans;
            }

        }
        if(newAns>maxSum){
            return root;
        }

        return finalans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root =takingInputLevelWise();
        TreeNode<Integer> ans = maxSumNode(root);
        System.out.println(ans.data);

    }
}
