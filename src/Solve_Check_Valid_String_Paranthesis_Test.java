import org.junit.Assert;
import org.junit.Test;

public class Solve_Check_Valid_String_Paranthesis_Test {
    @Test
    public void test(){
        Solve_Check_Valid_String_Paranthesis solve = new Solve_Check_Valid_String_Paranthesis();
        String inputValidString_1= "()[]{}";
        String inputValidString_2 ="()";
        String inputInValidString_1 ="(]";
        String inputInValidString_2 ="([)]";
        String inputInValidString_3 ="]";
        String inputInValidString_4 ="[";
       Assert.assertEquals(solve.isStringValid(inputInValidString_1),false);
       Assert.assertEquals(solve.isStringValid(inputValidString_1),true);
       Assert.assertEquals(solve.isStringValid(inputValidString_2),true);
       Assert.assertEquals(solve.isStringValid(inputInValidString_3),false);
       Assert.assertEquals(solve.isStringValid(inputInValidString_4),false);
       Assert.assertEquals(solve.isStringValid(inputInValidString_2),false);
    }
}
