package Trees;
import Queues.QueueIsEmptyEsxception;
import com.sun.source.tree.Tree;

import java.util.*;
public class TreeNodeUSse {

    public static int countLeafNodes(TreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        if(root.children.size()==0){
            return 1;
        }
        int count = 0;
        if(root.data==0){
          return  count =count+1;
        }
        for(int i = 0;i<root.children.size();i++){
            count+= countLeafNodes(root.children.get(i));
        }

        return count;
    }
    // preorder traversal
    public static void preOrder(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        for(int i = 0;i<root.children.size();i++){
            preOrder(root.children.get(i));
        }
    }
    //postOrder trraversal
    public static void postOrder(TreeNode<Integer> root){
        if(root==null){
            return;
        }


        for(int i = 0;i<root.children.size();i++){
            postOrder(root.children.get(i));
        }
        System.out.print(root.data+" ");
    }

    public static void printAtK(TreeNode<Integer> root,int k){
        if(root==null && k <0){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        for(int i=0;i<root.children.size();i++){
             printAtK(root.children.get(i),k-1);
        }
    }

    public static int getHeight(TreeNode<Integer> root){

        if(root==null){
            return 0;
        }
        int height = 0;
        for(int i = 0;i<root.children.size();i++){
            int count = 0;
            count = count  + getHeight(root.children.get(i));
            if(count >height){
                height = count;
            }
        }
        return height + 1;
    }

    public static int numNodes(TreeNode<Integer> root){

        if(root==null){
            return 0;
        }
        int count =1;
        for(int i = 0 ;i<root.children.size();i++){
            count = count + numNodes(root.children.get(i));
        }
        return count;
    }

    public static int sumNodes(TreeNode<Integer> root){

        if(root==null){
            return 0;
        }
        int sum =root.data;
        for(int i = 0 ;i<root.children.size();i++){
            sum = sum + numNodes(root.children.get(i));
        }
        return sum;
    }

    public static void printStepByStep(TreeNode<Integer> root) throws QueueIsEmptyEsxception {
        QueueWithLL <TreeNode<Integer>> ans = new QueueWithLL<>();
        ans.enqueue(root);
        System.out.println(root.data);

        while(!ans.isEmpty()){
            int n =ans.size();

//            System.out.print(newans.data + " ");
            for(int i=0;i<n;i++){
                TreeNode<Integer> newans = ans.dequeue();
                for(int j =0;j<newans.children.size();j++) {
                    ans.enqueue(newans.children.get(j));
                    System.out.print(newans.children.get(j).data + " ");

                }

            }
            System.out.println();

        }

    }


    public static TreeNode<Integer> takingInputLevelWise(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rootdata");
        int rootdata = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(rootdata);
        QueueWithLL<TreeNode<Integer>> pendingNode = new QueueWithLL<>();
        pendingNode.enqueue(root);

        while(!pendingNode.isEmpty()){
            try{
                TreeNode<Integer> frontNode  = pendingNode.dequeue();
                System.out.println("total no of childrent at node " + frontNode.data);
                int numchildrens = sc.nextInt();
                for(int i = 0;i<numchildrens;i++){
                    System.out.println("enter "+ (i+1) + "th node of root " + frontNode.data);
                    int child = sc.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(child);
                    pendingNode.enqueue(childNode);
                    frontNode.children.add(childNode);

                }
            }catch(QueueIsEmptyEsxception e){
                // never reach here;
                return null;
            }



        }
        return root;

    }

        public static void printLevelWise(TreeNode<Integer> root) throws QueueIsEmptyEsxception {
//        System.out.print(root.data+":");
        QueueWithLL<TreeNode<Integer>> n = new QueueWithLL<>();
        n.enqueue(root);
        while(!n.isEmpty()){
            TreeNode<Integer> ans = n.dequeue();
            System.out.print(ans.data+":");
            for(int i = 0;i <ans.children.size();i++){
                System.out.print(ans.children.get(i).data + ",");
                n.enqueue(ans.children.get(i));
            }
            System.out.println();
        }
    }

    public static TreeNode<Integer> takingInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter new newxt node");

        int n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("enter total no of childerens for "+n);
        int children = sc.nextInt();

        for(int i = 0; i <children;i++){
            TreeNode<Integer> child = takingInput();
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for(int i = 0;i<root.children.size();i++){
            s = s+root.children.get(i).data+ ",";
        }
        System.out.println(s);
        for(int i =0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }
    public static void main(String[] args) throws QueueIsEmptyEsxception {
//        TreeNode<Integer> root = takingInput();
        TreeNode<Integer> root1 = takingInputLevelWise();
//        print(root1);
        printStepByStep(root1);
        printAtK(root1,2);
        System.out.println();
        preOrder(root1);
        System.out.println();
        postOrder(root1);
//        TreeNode<Integer> root = new TreeNode<>(4);
//        TreeNode<Integer> node2 = new TreeNode<>(2);
//        TreeNode<Integer> node3 = new TreeNode<>(3);
//        TreeNode<Integer> node4 = new TreeNode<>(5);
//        TreeNode<Integer> node5 = new TreeNode<>(6);
//
//        root.children.add(node2);
//        root.children.add(node3);
//        root.children.add(node4);
//        node3.children.add(node5);
//
//        System.out.println(root);


    }
}
