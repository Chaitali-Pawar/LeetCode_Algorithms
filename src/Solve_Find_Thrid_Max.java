public class Solve_Find_Thrid_Max {

    public int getThirdMax(int [] nums){
        if(nums.length < 3){
            int max = Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>max){
                    max = nums[i];
                }
            }
            return max;
        }
        int min =Integer.MAX_VALUE;
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min && count <3){
                min = nums[i];
                count ++;
            }
        }
        return min;
    }
}
