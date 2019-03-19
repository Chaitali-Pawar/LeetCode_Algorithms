import org.junit.Test;

public class Solver_Test_Find_Cycle_In_Linked_List {

    @Test
    public void test(){
        ListNode head = new ListNode(3);
        ListNode node_1 = new ListNode(2);
        ListNode node_2 = new ListNode(0);
        ListNode node_3 = new ListNode(4);
        head.next =node_1;
        node_1.next =node_2;
        node_2.next=node_3;
        node_3.next=node_1;
        Solver_Find_Cycle_In_Linked_List solve = new Solver_Find_Cycle_In_Linked_List();
        solve.detectCycle(head);
    }
}
