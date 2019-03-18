import org.junit.Test;

public class Solver_Find_Smalles_positive_Test {
    @Test
    public void test(){
        Solver_Find_Smalles_Positive solve = new Solver_Find_Smalles_Positive();
        int a[] ={10,0,8,2,-1,12,11,3};
        System.out.println(solve.solution(a));
    }
}
