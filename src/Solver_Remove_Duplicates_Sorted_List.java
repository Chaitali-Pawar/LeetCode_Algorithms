/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2

Example 2:

Input: 1->1->2->3->3
Output: 1->2->3


 */

public class Solver_Remove_Duplicates_Sorted_List {
}

class Solve_Remove_Duplicates_Sorted_List{

    public ListNode removeDuplicates(ListNode head){
        ListNode current_node = head;
        while(current_node!=null && current_node.next!=null){
            if(current_node.val == current_node.next.val){
                current_node.next =current_node.next.next;
            }else{
                current_node = current_node.next;
            }
        }
        return head;
    }
}

