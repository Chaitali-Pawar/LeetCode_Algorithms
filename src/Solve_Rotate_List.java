

public class Solve_Rotate_List{
    public ListNode rotateRight(ListNode head, int k) {
        while(k!=0){
            while(head.next!=null){
                head = head.next;
            }
            ListNode prev = new ListNode(head.val);
            ListNode temp = head;
            head = prev;
            head.next = temp;
            while(head.next.next !=null){
                head.next = head.next;
            }
            head.next =null;
            k--;
        }
        return head;
    }

}
