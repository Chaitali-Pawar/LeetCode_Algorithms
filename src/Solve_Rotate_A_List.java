public class Solve_Rotate_A_List {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        while(k!=0){
            ListNode current = head;
            while(current.next!=null){
                current = current.next;
            }
            ListNode prev = new ListNode(current.val);
            ListNode temp = head;
            head = prev;
            head.next = temp;
            ListNode iterate = head;
            while(iterate.next.next !=null){
                iterate = iterate.next;
            }
            iterate.next =null;
            k--;
        }
        return head;
    }
}

