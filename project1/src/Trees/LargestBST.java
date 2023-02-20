package Trees;

public class LargestBST {

    public static Pair<Boolean,Triplet<Integer,Integer,Integer>> largestBST(BinaryTreeNode<Integer>root){

        if(root==null){
            Pair<Boolean,Triplet<Integer,Integer,Integer>> ans = new Pair<>();
            ans.first = true;
            ans.second = new Triplet<>();
            ans.second.first = Integer.MAX_VALUE;
            ans.second.second = Integer.MIN_VALUE;
            ans.second.third = 0;

            return ans;

        }

        Pair<Boolean,Triplet<Integer,Integer,Integer>> ans1 = largestBST(root.left);
        Pair<Boolean,Triplet<Integer,Integer,Integer>> ans2 = largestBST(root.right);

        int max= Math.max(root.data,Math.max(ans1.second.second,ans2.second.second));
        int min = Math.min(root.data,Math.min(ans1.second.first,ans2.second.first));
        int h1 = Math.max(height(root.left),height(root.right));
//        int heigt = Math.max(ans1.second.third,ans2.second.third);


        Pair<Boolean,Triplet<Integer,Integer,Integer>> ans = new Pair<>();
//        ans.first = true;
//        ans.second = new Triplet<>();
//        ans.second.first = Integer.MAX_VALUE;
//        ans.second.second = Integer.MIN_VALUE;
//        ans.second.third = 0;

        return ans;

    }
    static int height(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }

        if(root.left==null && root.right == null){
            return 1;
        }

       return  Math.max(height(root.left),height(root.right) +1);

    }
}
