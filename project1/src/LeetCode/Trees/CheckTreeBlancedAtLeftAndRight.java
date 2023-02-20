package LeetCode.Trees;

public class CheckTreeBlancedAtLeftAndRight {
    public static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }

        int l =leftCount(root.left,0);
        int r =rightCount(root.right,0);
        return r==l;


    }
    public static int leftCount(TreeNode root,int l){
        if(root==null){
            return 0;
        }
        l+=1;
        // r+=1;
        l +=leftCount(root.left,l);
        // r+=Count(root.right,;,r);
        return l;

    }
    public static int rightCount(TreeNode root,int r){
        if(root==null){
            return 0;
        }
        r+=1;
        // r+=1;
        // r +=leftCount(root.left,l,r);
        r+=rightCount(root.right,r);
        return r;

    }
}
