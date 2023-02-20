package Trees;

import Queues.QueueIsEmptyEsxception;

import java.util.Scanner;

import static Trees.BinaryTreeNodeUse.takingInputLevelWise;

public class printLevelWise {

    public static void printLevelWise(BinaryTreeNode<Integer> root) throws QueueIsEmptyEsxception {
        QueueWithLL<BinaryTreeNode<Integer>> pendingNode = new QueueWithLL<>();
        pendingNode.enqueue(root);
        pendingNode.enqueue(null);

        // System.out.println(root.data);


        while (!pendingNode.isEmpty()) {
            if (pendingNode.front() == null && pendingNode.size() == 1) {
                return;
            } else if (pendingNode.front() == null) {
                pendingNode.enqueue(null);
                pendingNode.dequeue();
                System.out.println();
            } else {

                System.out.print(pendingNode.front().data + " ");
                BinaryTreeNode<Integer> ans = pendingNode.dequeue();
                if (ans.left != null) {
                    pendingNode.enqueue(ans.left);
                }
                if (ans.right != null) {
                    pendingNode.enqueue(ans.right);
                }
            }

        }
    }

    public static void main(String[] args) throws QueueIsEmptyEsxception {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takingInputLevelWise(sc);
        printLevelWise(root);
    }
}
