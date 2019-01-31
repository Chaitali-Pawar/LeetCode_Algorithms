import org.junit.Assert;
import org.junit.Test;

public class Solver_Reverse_Palindrome_Test {

    @Test
    public void test(){
        ListNode  node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);
        node.next.next.next.next=null;
        Solve_Reverse_Palindrome_List solve = new Solve_Reverse_Palindrome_List();
        Assert.assertEquals(solve.isPalindrome(node),false);
        ListNode  node_2 = new ListNode(1);
        node_2.next = new ListNode(2);
        node_2.next.next = new ListNode(3);
        node_2.next.next.next = new ListNode(1);
        node_2.next.next.next.next = new ListNode(1);
        node_2.next.next.next.next.next=null;
        Assert.assertEquals(solve.isPalindrome(node_2),false);
    }
}
