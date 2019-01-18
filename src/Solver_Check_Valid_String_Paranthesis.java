import java.util.HashMap;
import java.util.Stack;

public class Solver_Check_Valid_String_Paranthesis {
    /*
    * Description
    * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

            Open brackets must be closed by the same type of brackets.
            Open brackets must be closed in the correct order.

        Note that an empty string is also considered valid.
    *
    *
    * */
}

class Solve_Check_Valid_String_Paranthesis {

    public boolean isStringValid(String s) {

        // use the concept of stack for matching the paranthesis
        HashMap<Character, Character> mapOfParanthesis= new HashMap<Character, Character>();
        mapOfParanthesis.put(')', '(');
        mapOfParanthesis.put(']', '[');
        mapOfParanthesis.put('}', '{');
        Stack<Character> stackParanthesis = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(!mapOfParanthesis.containsKey(s.charAt(i))){
                // if is an opening bracket then push it on top of stack
                stackParanthesis.push(s.charAt(i));
            }else{
                if( stackParanthesis.empty() || stackParanthesis.pop() != mapOfParanthesis.get(s.charAt(i)) ){
                    return false;
                }
            }

        }
        if(!stackParanthesis.empty()){
            return false;
        }
        return true;
    }
}
