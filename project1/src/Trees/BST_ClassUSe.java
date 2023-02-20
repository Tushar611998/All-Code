package Trees;

import java.util.Scanner;

import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class BST_ClassUSe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST_Class ans = new BST_Class();
        ans.insert(10);
        ans.insert(5);
        ans.insert(20);
        ans.insert(15);
        ans.insert(3);
        ans.insert(2);
        ans.delete(10);
        ans.delete(3);
        ans.printTree();
    }
}
