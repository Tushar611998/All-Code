package Trees;

import static Trees.TreeNodeUSse.takingInputLevelWise;

public class FindSecondLargest {
    static class pair<T>{
        T first;
        T second;
        public pair(T first, T second){
            this.first = first;
            this.second = second;
        }

    }
    public static pair<TreeNode<Integer>> helper(TreeNode<Integer> root){

        pair<TreeNode<Integer>> ans;

        if(root==null){
            ans = new pair<TreeNode<Integer>>(null,null);
            return ans;
        }
        ans = new pair<TreeNode<Integer>>(root,null);
        for(int i = 0;i<root.children.size();i++){
            pair<TreeNode<Integer>> newAns = helper(root.children.get(i));

            if(newAns.first.data>ans.first.data){
                if( newAns.second==null || newAns.second.data <ans.first.data){
                    ans.second = ans.first;
                    ans.first = newAns.first;
                }else{
                    ans.first = newAns.first;
                    ans.second = newAns.second;
                }
                }
            else if(newAns.first.data.equals(ans.first.data) && newAns.second!=null){
                ans.second = newAns.second;
            }
            else if(ans.first.data!=newAns.first.data && (ans.second==null || ans.second.data<newAns.first.data)){
                ans.second = newAns.first;
            }

        }
        return ans;
    }
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        return helper(root).second;

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takingInputLevelWise();
        TreeNode<Integer> ans = findSecondLargest(root);
        System.out.println(ans.data);
    }
}

