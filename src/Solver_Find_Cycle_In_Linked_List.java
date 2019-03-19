public class Solver_Find_Cycle_In_Linked_List {

    public ListNode detectCycle(ListNode head) {
        ListNode head_ptr = head;
        ListNode slow_pointer = head;
        ListNode fast_pointer = head;
        while(slow_pointer !=null && fast_pointer!=null && fast_pointer.next!=null){
            slow_pointer = slow_pointer.next;
            fast_pointer =fast_pointer.next.next;
            if(slow_pointer == fast_pointer){
                // cycle exists
                while(head_ptr!=slow_pointer){
                    head_ptr = head_ptr.next;
                    slow_pointer =slow_pointer.next;
                }
                return head_ptr;
            }
        }
        return null;
    }
}
