package Trees;

import Queues.QueueIsEmptyEsxception;
import Trees.BinaryTreeNodeUse;

import static Trees.BinaryTreeNodeUse.printBinaryTree;

public class SortedArrayToBST {
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n) {
        return SortedArrayToBSTHelper(arr, n, 0, arr.length - 1);
    }

    public static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int n, int si, int ei) {
        if (si > ei) {
            return null;
        }

        int mid = (si + ei) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        BinaryTreeNode<Integer> ans = SortedArrayToBSTHelper(arr, n, si, mid - 1);
        root.left = ans;
        BinaryTreeNode<Integer> newAns = SortedArrayToBSTHelper(arr, n, mid + 1, ei);
        root.right = newAns;

        return root;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        BinaryTreeNode<Integer> root = SortedArrayToBST(arr,7);
        printBinaryTree(root);


    }
}
