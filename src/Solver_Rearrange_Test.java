import org.junit.Test;

import java.util.List;

public class Solver_Rearrange_Test {
    @Test
    public void test(){
       Solver_Rearrange_String solve = new Solver_Rearrange_String();
       int S[] ={2,2,2,4,5};
       int E[] ={4,4,4,5,6};
        int S_1[] ={1,2,6,5,3};
        int E_1[] ={5,5,7,6,8};
        int S_2[] ={1,2,3,4,5};
        int E_2[] ={2,3,4,5,6};
        int S_3[] ={2,2,2,4,6};
        int E_3[] ={3,3,3,5,6};
      // int Y[] = {1,2,-4,2,-1};
       solve.findNumber(5);

       // System.out.println(solve.oddNumbers(2,5));
    }
}
