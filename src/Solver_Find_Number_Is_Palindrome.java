public class Solver_Find_Number_Is_Palindrome {
}
class Solve_Number_Is_Palindrome{

    public boolean isPalindrome(int x){
        if(Math.signum((float)x) == -1){
            return false;
        }
        else{

            char [] inputArray = String.valueOf(x).toCharArray();
            if(inputArray.length ==1)
                return true;
            for(int i=0;i<(inputArray.length /2);i++){
                if(inputArray[i]!=inputArray[inputArray.length -i-1])
                    return false;
            }
            return true;
        }
    }
}
