package Trees;

import java.util.Scanner;

import static Trees.BinaryTreeNodeUse.printBinaryTree;
import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class MakeBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
        printBinaryTree(root);
    }





}
