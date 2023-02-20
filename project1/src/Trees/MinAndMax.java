package Trees;

import java.util.Scanner;

import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class MinAndMax {

    public static ppair<Integer,Integer> minMax = new ppair<Integer,Integer>(Integer.MAX_VALUE,Integer.MIN_VALUE);

    public static void getMinAndMaxHelper(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        if(root.data< minMax.minimum){
            minMax.minimum = root.data;
        }
        if(root.data> minMax.maximum){
            minMax.maximum = root.data;
        }

        getMinAndMaxHelper(root.left);
        getMinAndMaxHelper(root.right);
    }
    public static ppair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {

        getMinAndMaxHelper(root);
        return minMax;




        //Your code goes here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
        ppair<Integer,Integer> ans = getMinAndMax(root);
        System.out.println(ans.minimum +" " + ans.maximum);
    }
}
class ppair<T, U> {
    T minimum;
    U maximum;

    public ppair(T minimum,U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}
