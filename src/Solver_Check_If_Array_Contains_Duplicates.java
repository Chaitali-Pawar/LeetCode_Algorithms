import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solver_Check_If_Array_Contains_Duplicates {
}

class Solve_Check_Array_Contains_Duplicates{
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashOfNums = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hashOfNums.size() ==0 || !hashOfNums.contains(nums[i])){
                hashOfNums.add(nums[i]);
            }else{
                return true;
            }
        }
        return false;

    }
}


