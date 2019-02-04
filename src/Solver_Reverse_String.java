public class Solver_Reverse_String {


}

class Solve_Reverse_String{

    public char[] reverseString(char [] input){
        final int length = input.length;
        for(int i=0;i<input.length/2 ;i++){
            char temp = input[i];
            input[i] = input[length-i-1];
            input[length -i-1] =temp;
        }
        return input;

    }
}
