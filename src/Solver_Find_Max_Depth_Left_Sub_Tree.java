import com.sun.source.tree.Tree;
/*
    3
   / \
  9  20
    /  \
   15   7
 */

public class Solver_Find_Max_Depth_Left_Sub_Tree {




}
class Solve_Find_Max_Depth_Left_Sub_Tree{

    public int maxDepth(TreeNode root){
        int left_subtree_height = 0;
        int right_subtree_height = 0;
        if(root == null){
            return 0;
        }else{
            left_subtree_height = maxDepth(root.left);
            right_subtree_height =maxDepth(root.right);
            return Math.max(left_subtree_height,right_subtree_height) +1;
        }

    }

}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
