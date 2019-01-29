import org.junit.Assert;
import org.junit.Test;

import java.security.PublicKey;

public class Solver_Find_Number_Is_Palindrome_Test {

   @Test
    public void test(){
       Solve_Number_Is_Palindrome solve = new Solve_Number_Is_Palindrome();
       int test_1 = 121;
       int test_2 = 123;
       int test_3 = -1123;
       int test_4 = 10;
       int test_5 = 11;
       Assert.assertEquals(solve.isPalindrome(test_1),true);
       Assert.assertEquals(solve.isPalindrome(test_2),false);
       Assert.assertEquals(solve.isPalindrome(test_3),false);
      Assert.assertEquals(solve.isPalindrome(test_4),false);
      Assert.assertEquals(solve.isPalindrome(test_5),true);
   }
}
