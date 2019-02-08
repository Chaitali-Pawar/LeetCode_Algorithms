import java.util.List;

public class Solve_Rotate_A_List {
    /*
    [1]
1
check
     */
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode current = head;
        int lengthOfList = 1;
        while(current.next!=null){
            current = current.next;
            lengthOfList ++;
        }
        int noOfTimesToIterate = (Math.abs(lengthOfList - k))%lengthOfList;
        if(noOfTimesToIterate == 0){
            return head;
        }
        ListNode pointerCurrent = head;
        ListNode prev = head;
        while(noOfTimesToIterate !=0){
            prev =pointerCurrent;
            pointerCurrent = pointerCurrent.next;
            noOfTimesToIterate --;
        }
        ListNode pointerCurrentHead = pointerCurrent;
        while(pointerCurrent.next !=null){
            pointerCurrent = pointerCurrentHead.next;
        }
        ListNode temp = head;
        pointerCurrent.next = temp;
        prev.next = null;
        head = pointerCurrentHead;
        return head;





       /* while(k!=0){
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
        }*/

    }
}

