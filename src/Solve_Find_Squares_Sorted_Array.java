import java.util.Arrays;

public class Solve_Find_Squares_Sorted_Array {

    public int[] sortedSquares(int[] A) {
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
