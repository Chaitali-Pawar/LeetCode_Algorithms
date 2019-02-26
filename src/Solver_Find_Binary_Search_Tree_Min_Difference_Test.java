import org.junit.Test;

public class Solver_Find_Binary_Search_Tree_Min_Difference_Test {

    @Test
    public void test(){
        Tree_Node_1 root = new Tree_Node_1(8);
        Tree_Node_1 node_6 = new Tree_Node_1(6);
        Tree_Node_1 node_1 = new Tree_Node_1(1);
        Tree_Node_1 node_3 = new Tree_Node_1(3);
        node_3.left=node_1;
        node_3.right=node_6;
        root.left=node_3;
        Solver_Find_Binary_Search_Tree_Min_Difference solve = new Solver_Find_Binary_Search_Tree_Min_Difference();
       solve.minDiffInBST(root);
    }
}
