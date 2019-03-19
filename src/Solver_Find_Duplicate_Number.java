
public class Solver_Find_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        // One way of finding duplicates in an array is to use the sorting method
        // but this incurs cost complexity of nlogn
       /* Arrays.sort(nums);
        for(int i=0;i<nums.length -1;i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }*/

       // thus use the concept of finding a cycle within a linked list
        // another method that can be used can be that of hashing and set but would use a space of0(n)
        // if a cycle exists then find common point and return the number
        int slow_pointer = nums[0];
        int fast_pointer = nums[0];
        do{
            slow_pointer = nums[slow_pointer];
            fast_pointer =nums[nums[fast_pointer]]; //equivalent to doing fast.next.next in linked list

        }while(slow_pointer!=fast_pointer);

        int ptr1 = nums[0];
        int ptr2 = slow_pointer;
        while(ptr1!=ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;
    }
}
