import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solver_Find_Duplicates_Test {

    @Test
    public void test(){
        Solver_Find_Duplicates solver = new Solver_Find_Duplicates();
        int test_array[] = {4,3,2,7,8,2,3,1};
        List<Integer> result = new ArrayList<>();
        result.add(2);
        result.add(3);
        Assert.assertEquals(solver.findDuplicates(test_array),result);
       // solver.findDuplicates(test_array);
    }
}
