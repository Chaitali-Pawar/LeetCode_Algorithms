import org.junit.Assert;
import org.junit.Test;

public class Solve_Reverse_String_Test {
    @Test
    public void test(){
        Solve_Reverse_String solve = new Solve_Reverse_String();
        String input ="hello";
        char [] output = {'o','l','l','e','h'};
        Assert.assertArrayEquals(solve.reverseString(input.toCharArray()),output);
    }
}
