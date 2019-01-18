import org.junit.Assert;
import org.junit.Test;

public class Solve_Longest_Common_Prefix_Test {

    @Test
    public void test() {
        Solve_Longest_Common_Prefix solve = new Solve_Longest_Common_Prefix();
        String[] inputString = {"flower", "flow", "flight"};
        Assert.assertEquals(solve.getLongestCommonPrefix(inputString),"fl");
    }
}
