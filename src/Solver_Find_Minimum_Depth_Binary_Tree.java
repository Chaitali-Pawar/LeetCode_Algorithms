/*
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its minimum depth = 2.

 */
public class Solver_Find_Minimum_Depth_Binary_Tree {

    public static void main(String args[]){
        Solve_Find_Minimum_Depth_Binary_Tree solve = new Solve_Find_Minimum_Depth_Binary_Tree();
        Tree_Node root_test_1 = new Tree_Node(2);
        Tree_Node left_test_1 = new Tree_Node(1);
        root_test_1.left =left_test_1;
        solve.findMinDepthOfBinaryTree(root_test_1);
    }

}

class Solve_Find_Minimum_Depth_Binary_Tree{

    public int findMinDepthOfBinaryTree(Tree_Node head){
        if(head == null){
            return 0;
        }
        else{
            int left_depth = findMinDepthOfBinaryTree(head.left);
            int right_depth = findMinDepthOfBinaryTree(head.right);
            if(left_depth == 0){
                // check condition for root node
                return right_depth +1;
            }else if(right_depth ==0){
                // check condition for root node
                return left_depth +1;
            }else{
                return Math.min(left_depth,right_depth) +1;
            }

        }
    }
}

class Tree_Node{
    int value;
    Tree_Node left;
    Tree_Node right;
    Tree_Node(int x){
        this.value =x;
    }
}
