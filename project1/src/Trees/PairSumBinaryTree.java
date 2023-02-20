package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class PairSumBinaryTree {
    static  ArrayList<Integer> arr = new ArrayList<Integer>();
    static void pairSumH(BinaryTreeNode<Integer> root, int sum) {

        Collections.sort(arr);

        int i =0;
        int j = arr.size()-1;

        while(i<j){
            if((arr.get(i) + arr.get(j))== sum){
                System.out.println(arr.get(i) + " " + arr.get(j));
                i++;
                j--;
            }else if((arr.get(i) + arr.get(j))>sum){
                j--;
            }else{
                i++;
            }
        }
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
    }
    static void pairSum(BinaryTreeNode<Integer> root, int sum) {
        pairSumB(root,sum);
        pairSumH(root,sum);
    }
    static void pairSumB(BinaryTreeNode<Integer> root, int sum) {
        if(root==null){
            return;
        }


        arr.add(root.data);

        pairSumB(root.left,sum);
        pairSumB(root.right,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
        pairSum(root,11);
    }
}
