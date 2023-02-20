package Trees;

import java.sql.SQLOutput;

public class BST_Class {

    private BinaryTreeNode<Integer> root;
    public BST_Class(){
        root=null;
    }
    private void printTreeHelper(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        String s = root.data + ":-";
        if(root.left!=null){
            s+= "L:" + root.left.data + ",";
        }
        if(root.right!=null){
            s+= "R:" + root.right.data + ",";
        }
        System.out.println(s);
        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }
    public void printTree(){
        printTreeHelper(root);
    }

    private BinaryTreeNode<Integer> insertHelper(int data, BinaryTreeNode<Integer> root){
        if(root==null){
             BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<>(data);
             return newRoot;
        }

        if(data<=root.data){
            root.left = insertHelper(data,root.left);
        }
        else{
            root.right = insertHelper(data,root.right);
        }
        return root;

    }

    private BinaryTreeNode<Integer> deleteHelper(int data, BinaryTreeNode<Integer> root){

        if(root==null){
            return null;
        }
        if(root.data>data){
            root.left =deleteHelper(data,root.left);
                return  root;

        }else if(root.data<data) {
            root.right = deleteHelper(data, root.right);
            return root;
        }else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }else{
                BinaryTreeNode<Integer> minNode= root.right;
                while(minNode.left!=null){
                    minNode = minNode.left;
                }
                root.data =minNode.data;
                root.right = deleteHelper(minNode.data,root.right);
                return root;
            }
        }
    }
    public void delete(int data){
        root = deleteHelper(data,root);
        return;
    }

    public void insert(int data){
        root = insertHelper(data,root);
        return;
    }

    public boolean isNodePresent( int data){
        return isNodePresentHelper(data,root);

    }
    private boolean isNodePresentHelper(int data,BinaryTreeNode<Integer> root){
        if(root==null){
            return false;
        }

        if(root.data==data){
            return true;
        }else if(root.data>data){
            return isNodePresentHelper(data, root.left);
        }else{
            return isNodePresentHelper(data,root.right);
        }
    }
}
