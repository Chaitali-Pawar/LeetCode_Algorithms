import org.junit.Test;

public class Solve_Rotate_List_Test {
    @Test
    public void test(){
        Solve_Rotate_A_List solve = new Solve_Rotate_A_List();
        ListNode node_4 = new ListNode(4);
        ListNode node_3 = new ListNode(3);
        ListNode node_2 = new ListNode(2);
        ListNode node_1 = new ListNode(1);
        node_1.next = node_2;
        node_2.next =node_3;
        node_3.next =node_4;
        node_4.next =null;
        solve.rotateRight(node_1,1);
    }
}
