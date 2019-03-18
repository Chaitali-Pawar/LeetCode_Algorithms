import org.junit.Test;

public class Solver_Test_Pre_Order_Traversal_Paranthesis_Test {

    @Test
    public void test(){
        Solver_Pre_Order_Traversal_Paranthesis solver = new Solver_Pre_Order_Traversal_Paranthesis();
        /*Tree_Node_1 node_root = new Tree_Node_1(1);
        Tree_Node_1 left_1 = new Tree_Node_1(1);
        Tree_Node_1 right_1 = new Tree_Node_1(1);
        Tree_Node_1 left_2 = new Tree_Node_1(1);
        node_root.left =left_1;
        node_root.right=right_1;
        left_1.left=left_2;
        StringBuilder result = new StringBuilder();
        solver.preOrderTreeTraversal(node_root,true);
        solver.result.deleteCharAt(solver.result.length()-1);
        System.out.println("result is"+solver.result);*/


        Tree_Node_1 node_root_1 = new Tree_Node_1(1);
        Tree_Node_1 left_1_1 = new Tree_Node_1(1);
        Tree_Node_1 right_1_1 = new Tree_Node_1(1);
        Tree_Node_1 right_2_1 = new Tree_Node_1(1);
        node_root_1.left =left_1_1;
        node_root_1.right=right_1_1;
        left_1_1.right=right_2_1;
        solver.preOrderTreeTraversal(node_root_1,true);
        solver.result.deleteCharAt(solver.result.length()-1);
        System.out.println("result is"+solver.result);
    }
}
