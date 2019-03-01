import org.junit.Test;

public class Solver_Find_K_Closest_Elements_Test {

    @Test
    public void test(){
        Solver_Find_K_Closest_Elements solve = new Solver_Find_K_Closest_Elements();
        int arr[] = {0,0,0,1,3,5,6,7,8,8};
        int arr_2[] = {0,0,1,2,3,3,4,7,7,8};
        System.out.println(solve.binarySearch(arr,0,arr.length-1,2));
        System.out.println(solve.binarySearch(arr_2,0,arr.length-1,5));

    }

}
