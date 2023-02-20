package Trees;

import static Trees.TreeNodeUSse.takingInputLevelWise;

public class NextLargerElement {
    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

        TreeNode<Integer> ans = null;
//        TreeNode<Integer> temp = null;

        if(root.data>n){
            ans = root;
        }

        for(int i = 0;i<root.children.size();i++){
            TreeNode<Integer> newAns = findNextLargerNode(root.children.get(i),n);
            if(newAns==null){
                continue;
            }
            if(ans==null){
                ans = newAns;
            }
            else if(newAns.data >n && newAns.data <ans.data ){
                ans = newAns;
            }
        }
        return ans;

//        if(  temp!=null && ans!=null && temp.data<ans.data){
//            return temp;
//        }
//        return temp;


        // Write your code here

    }

    public static void main(String[] args) {

        TreeNode<Integer> root = takingInputLevelWise();
        TreeNode<Integer> root1 = findNextLargerNode(root,10);
        System.out.println(root1.data);


    }
}
