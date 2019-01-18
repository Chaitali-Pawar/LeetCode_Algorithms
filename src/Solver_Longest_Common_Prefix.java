import java.util.HashMap;
import java.util.LinkedList;

public class Solver_Longest_Common_Prefix {


}

class Solve_Longest_Common_Prefix{

    public String getLongestCommonPrefix(String [] inputStringArray){
        StringBuilder inputStringBuilderArray [] = new StringBuilder[inputStringArray.length];
        for(int i =0;i<inputStringArray.length;i++){
            inputStringBuilderArray[i] = new StringBuilder(inputStringArray[i]);
        }

        for(int i=0;i<inputStringArray[0].length();i++){
            char c = inputStringArray[0].charAt(i);
            for(int j=1;j<inputStringArray.length;j++){
                if(c != inputStringArray[j].charAt(i) || inputStringArray[j].length() == i)
                    return inputStringArray[0].substring(0,i);
            }
        }
        return inputStringArray[0];

    }
}


