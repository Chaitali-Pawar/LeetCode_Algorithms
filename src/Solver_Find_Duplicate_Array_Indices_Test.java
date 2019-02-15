import org.junit.Assert;
import org.junit.Test;

public class Solver_Find_Duplicate_Array_Indices_Test {

    @Test
    public void test(){
        Solve_Find_Duplicate_Array_Indices solve = new Solve_Find_Duplicate_Array_Indices();
        int test_1[] ={1,2,3,1};
        int test_2[] ={1,0,1,1};
        int test_3[] ={1,2,3,1,2,3};
        Assert.assertEquals(solve.containsNearbyDuplicate(test_1,3) ,true);
        Assert.assertEquals(solve.containsNearbyDuplicate(test_2,1) ,true);
        Assert.assertEquals(solve.containsNearbyDuplicate(test_3,2) ,false);
    }
}
