import org.junit.Assert;
import org.junit.Test;

public class Solve_Check_Array_Contains_Duplicates_Test {

    @Test
    public void test(){
        Solve_Check_Array_Contains_Duplicates solve = new Solve_Check_Array_Contains_Duplicates();
        int test_1[] ={1,2,3,1};
        int test_2[] ={1,2,3,4};
        int test_3[] ={1,1,1,3,3,4,3,2,4,2};
        Assert.assertEquals(solve.containsDuplicate(test_1),true);
        Assert.assertEquals(solve.containsDuplicate(test_2),false);
        Assert.assertEquals(solve.containsDuplicate(test_3),true);
    }
}
