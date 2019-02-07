import org.junit.Assert;
import org.junit.Test;

public class Solver_Rotate_Array_Test {

    @Test
    public void test(){
        int input_array [] ={1,2,3,4,5,6,7 };
        int output_array [] ={5,6,7,1,2,3,4};
        Solve_Rotate_Array solve = new Solve_Rotate_Array();
        Assert.assertArrayEquals(solve.rotateArray(input_array,3),output_array);
    }
}
