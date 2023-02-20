package Trees;

import static Trees.TreeNodeUSse.takingInputLevelWise;

public class StructurallyIdentical {
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
        if(root1==null || root2==null){
            return false;
        }
        if(root1.children.size()!= root2.children.size() ){
            return false;
        }
        boolean ans;
        if(root1.data==root2.data){
            ans = true;
        }
        else{return false;}
        for(int i = 0;i<root1.children.size();i++){
            ans = checkIdentical(root1.children.get(i),root2.children.get(i));
            if(ans==false){
                return false;
            }
        }
        if(ans){
            return true;
        }
        return ans;
//        if(root1.data==root2.data){
//            return true;
//        }
//        for(int j =0;j<root1.children.size() && j<root2.children.size();j++) {
//            TreeNode<Integer> newNode = root1.children.get(j);
//            TreeNode<Integer> newNode1 = root2.children.get(j);
//            for (int i = 0; i <root1.children.get(j).children.size(); i++) {
//                int ans = newNode.children.get(i).data;
//                int newAns = newNode1.children.get(i).data;
//                if (ans != newAns) {
//                    return false;
//                }
//            }
//        }
//        return true;

    }

    public static void main(String[] args) {
        TreeNode<Integer> root1 = takingInputLevelWise();
        TreeNode<Integer> root2 = takingInputLevelWise();
        boolean NEwans = checkIdentical( root1, root2);
        System.out.println(NEwans);
    }
}
