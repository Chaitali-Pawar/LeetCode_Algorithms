import org.junit.Test;

public class Solver_Inoder_Tree_Traversal_Stack_Test {

    @Test
    public void test(){
        Solver_Inorder_Tree_Traversal_Using_Stack solve = new Solver_Inorder_Tree_Traversal_Using_Stack();
        Tree_Node_1 root = new Tree_Node_1(8);
        Tree_Node_1 node_6 = new Tree_Node_1(6);
        Tree_Node_1 node_1 = new Tree_Node_1(1);
        Tree_Node_1 node_3 = new Tree_Node_1(3);
        node_3.left=node_1;
        node_3.right=node_6;
        root.left=node_3;
        solve.inorderTraversal(root);
    }
}
