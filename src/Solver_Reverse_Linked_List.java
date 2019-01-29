/*
* Program to reverse a linked list
* use the concept of 3 pointers to reverse the linked list
* prev->current->next
* next->prev->current
* */

class Solve_Reverse_Linked_List{

    public ListNode reverseNode(ListNode head){
        ListNode prev= null;
        ListNode next = null;
        ListNode current = head;
        while (current !=null){
            next = current.next;
            currenrt.next =prev;
            prev =current;
            current =next;
        }
        head=prev;
        return  head;
    }

}
