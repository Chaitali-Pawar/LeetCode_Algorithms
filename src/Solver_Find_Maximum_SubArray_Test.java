import org.junit.Assert;
import org.junit.Test;

public class Solver_Find_Maximum_SubArray_Test {
    @Test
    public  void test(){
    Solve_Find_Maximum_SubArray solve = new Solve_Find_Maximum_SubArray();
    int input_array_1[] = {-2,1,-3,4,-1,2,1,-5,4};
        Assert.assertEquals(solve.getMaxSum(input_array_1),6);
    }
}