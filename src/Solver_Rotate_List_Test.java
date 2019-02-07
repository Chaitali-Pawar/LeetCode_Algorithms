import org.junit.Test;

public class Solver_Rotate_List_Test {

    @Test
    public void test(){
       Solve_Rotate_A_List solve = new Solve_Rotate_A_List();
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(1);
        n2.next =n3;
        n1.next =n1;
        solve.rotateRight(n1,1);
    }
}
