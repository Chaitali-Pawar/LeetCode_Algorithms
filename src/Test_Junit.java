import org.junit.Assert;
import org.junit.Test;

public class Test_Junit {
    @Test
    public void test(){
        Solver_Find_Length_of_Longest_Substring solve = new Solver_Find_Length_of_Longest_Substring();
        Assert.assertEquals(solve.length_of_longest_substring("pwwkew"),3);
    }
}
