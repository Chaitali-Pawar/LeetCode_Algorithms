import java.util.HashSet;

public class Solver_Find_Length_of_Longest_Substring {

    public int length_of_longest_substring(String s){
        // use concept of 2 pointers
        int i=0;
        int j=0;
        int maxLength = 0;
        HashSet<Character> hashSet =  new HashSet<>();
        while(j<s.length()){
            // j is a fast pointer that iterates though string to check if the character is already present
            // in the set if it is then remove the char from the set and increment the i pointer to find
            // another substring of length greater than current max length.
            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j));
                j++;
                maxLength =Math.max(maxLength,j-i);
            }else{
                hashSet.remove(s.charAt(i));
                i++;
            }

        }
        return maxLength;
    }
}
