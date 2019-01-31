public class Solver_Reverse_Palindrome_List {
    // divide the list into 2 halves , get to the middle of the list , now reverse the second half and compare with
    // first half , if equal the list is a palindrome.
}

class Solve_Reverse_Palindrome_List{

    public boolean isPalindrome(ListNode head){
        if(head == null || head.next ==null){
            return true;
        }

        else{
            // assign 2 new nodes to find the middle element
            ListNode middle = head;
            ListNode last=head;
            while(last!=null && last.next!=null){
                middle = middle.next;
                last =last.next.next;
                // we get the middle most element
            }
            // once we get the middle most element reverse the second half of the list
            ListNode reverseSecondHalf = reverseNode(middle);

            while(head!=null && reverseSecondHalf!=null){
                if(head.val!=reverseSecondHalf.val){
                    return false;
                }
                head = head.next;
                reverseSecondHalf = reverseSecondHalf.next;
            }
            return true;
        }
    }

    public ListNode reverseNode(ListNode node){
        ListNode prev= null;
        ListNode next = null;
        ListNode current = node;
        while (current !=null){
            next = current.next;
            current.next =prev;
            prev =current;
            current =next;
        }
        node=prev;
        return  node;
    }
}
