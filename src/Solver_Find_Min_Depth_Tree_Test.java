import org.junit.Assert;
import org.junit.Test;

public class Solver_Find_Min_Depth_Tree_Test {
    @Test
    public void test(){
        Solve_Find_Minimum_Depth_Binary_Tree solve = new Solve_Find_Minimum_Depth_Binary_Tree();
        Tree_Node root_test_1 = new Tree_Node(2);
        Tree_Node left_test_1 = new Tree_Node(1);
        root_test_1.left =left_test_1;
        Assert.assertEquals(solve.findMinDepthOfBinaryTree(root_test_1),2);
        Tree_Node root_test_2 = new Tree_Node(2);
        Tree_Node left_test_2 = new Tree_Node(1);
        Tree_Node right_test_2 = new Tree_Node(3);
        Tree_Node right_test_2_1 = new Tree_Node(4);
        root_test_2.left =left_test_2;
        root_test_2.right=right_test_2;
        right_test_2.right = right_test_2_1;
        Assert.assertEquals(solve.findMinDepthOfBinaryTree(root_test_2),2);

    }
}
