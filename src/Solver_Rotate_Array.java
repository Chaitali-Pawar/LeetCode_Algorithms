public class Solver_Rotate_Array {


}
class Solve_Rotate_Array{

    public int[] rotateArray(int input[] ,int k){
        while(k!=0){
            int last_element = input[input.length -1];
            for(int i=input.length-1;i>0;i--){
                input[i] =input[i-1];
            }
            input[0] =last_element;
            k--;
        }
        return input;
    }
}
