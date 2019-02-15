
public class Solver_Find_Duplicate_Array_Indices {
}

class Solve_Find_Duplicate_Array_Indices{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++){
             if(nums[i] == nums[j]){
                 if((j-i)<=k){
                     return true;
                 }
             }
         }
     }
     // else use a hash map insert and remove values insert if value is not present and remove when
        // matches but the index condition fails
     return false;
    }
}
