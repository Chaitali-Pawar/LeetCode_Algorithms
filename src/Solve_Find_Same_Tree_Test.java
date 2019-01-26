import org.junit.Assert;
import org.junit.Test;
/*
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true

Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false

Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false

 */
public class Solve_Find_Same_Tree_Test {
    @Test
    public void test(){
        Tree_Node test_1 = new  Tree_Node(1);
        test_1.right=new Tree_Node(2);
        test_1.left= new Tree_Node(1);
        Tree_Node test_2 = new  Tree_Node(1);
        test_2.right=new Tree_Node(1);
        test_2.left= new Tree_Node(2);
        Solver_Find_Same_Tree solve = new Solver_Find_Same_Tree();
        //Assert.assertEquals(solve.);

    }
}
