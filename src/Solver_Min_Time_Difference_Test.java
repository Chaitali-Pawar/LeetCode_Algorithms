import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solver_Min_Time_Difference_Test {

    @Test
    public void test(){
        Solver_Minimum_Time_Difference solve = new Solver_Minimum_Time_Difference();
        //["23:59","00:00"]
        List<String> test = new ArrayList<>();
        String string_1 = "00:01";
        String string_2 = "23:59";
        test.add(string_1);
        test.add(string_2);
        solve.findMinDifference(test);
    }
}
