import org.junit.Assert;
import org.junit.Test;

public class Solver_Remove_Element_Test {

    @Test
    public void test(){
        Solve_Remove_Element solve = new Solve_Remove_Element();
        int input_array_1 [] = {3,2,2,3,4};
        int value_1 =3;
        int input_array_2 [] = {0,1,2,2,3,0,4,2};
        int value_2 =2;
        Assert.assertEquals(solve.removeElement(input_array_1,value_1),3);
        Assert.assertEquals(solve.removeElement(input_array_2,value_2),5);
    }
}
