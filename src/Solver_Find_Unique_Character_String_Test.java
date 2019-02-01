import org.junit.Assert;
import org.junit.Test;

public class Solver_Find_Unique_Character_String_Test {
    @Test
    public void test(){
        Solve_Find_Unique_Character_String solve= new Solve_Find_Unique_Character_String();
        String input_1= "leetcode";
        String input_2 ="loveleetcode";
        String input_3 ="cc";
        Assert.assertEquals(solve.firstUniqCharacter(input_1),0);
       Assert.assertEquals(solve.firstUniqCharacter(input_2),2);
        Assert.assertEquals(solve.firstUniqCharacter(input_3),-1);

    }
}
