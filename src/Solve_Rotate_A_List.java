import java.util.List;

public class Solve_Rotate_A_List {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k ==0){
            return head;
        }
        // find the length of the list
        ListNode lengthOfListNode = head;
        int lengthOfList =1;
        while(lengthOfListNode.next !=null){
            lengthOfList++;
            lengthOfListNode = lengthOfListNode.next;
        }

        ListNode currentPointer  = head;
        ListNode prev = head;
        int noOfIterations = Math.abs((k%lengthOfList) - lengthOfList);
        if(noOfIterations ==lengthOfList){
            return head;
        }
        while(noOfIterations!=-1 && currentPointer.next!=null){
            prev = currentPointer;
            currentPointer =currentPointer.next;
            noOfIterations --;
        }
        prev.next =null;
        ListNode currentPointerHead = currentPointer;
        ListNode temp=head;
        while(currentPointer.next!=null ){
            currentPointer =currentPointer.next;
        }
        currentPointer.next =temp;
        head =currentPointerHead;
        return head;
    }
}

