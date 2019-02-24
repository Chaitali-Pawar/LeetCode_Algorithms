import org.junit.Test;

public class Solver_K_Closest_Point_Origin_Test {
    @Test
    public void test(){
        Solver_K_Closet_Point_Origin solve = new Solver_K_Closet_Point_Origin();
        int [][] points ={
                {3,3},
                {5,-1},
                {-2,4}

        };
        solve.kClosest(points,2);
    }
}
