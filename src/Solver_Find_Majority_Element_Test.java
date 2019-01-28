import org.junit.Assert;
import org.junit.Test;

public class Solver_Find_Majority_Element_Test {
    @Test
    public void test(){
        int input_array_1 [] = {3,2,3};
        int input_array_2 [] = {2,2,1,1,1,2,2};
        Solve_Find_Majority_Element solve = new Solve_Find_Majority_Element();
        Assert.assertEquals(solve.getMajorityElement(input_array_1),3);
        Assert.assertEquals(solve.getMajorityElement(input_array_2),2);
    }
}
