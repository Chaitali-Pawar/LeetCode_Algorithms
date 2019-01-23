import org.junit.Test;

public class Solver_Remove_Duplicates_Sorted_List_Test {

    @Test
    public void test(){
        Solve_Remove_Duplicates_Sorted_List solve = new Solve_Remove_Duplicates_Sorted_List();
        ListNode x = new ListNode(1);
        ListNode y = new ListNode(1);
        ListNode z = new ListNode(2);
        x.next = y;
        y.next =z;
        ListNode result =solve.removeDuplicates(x);
        while(result.next !=null){
            System.out.println(result.val);
            result = result.next;
        }

    }
}
