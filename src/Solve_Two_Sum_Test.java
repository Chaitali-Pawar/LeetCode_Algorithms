import org.junit.Assert;
import org.junit.Test;

public class Solve_Two_Sum_Test {

    @Test
    public void test(){
        Solve_Two_Sum solve = new Solve_Two_Sum();
        int input_array_1 []= {2,7,11,15};
        int target_1 =9;
        int solution_1 [] ={0,1};
        Assert.assertArrayEquals(solve.findTwoSum(input_array_1,target_1),solution_1);
    }
}
