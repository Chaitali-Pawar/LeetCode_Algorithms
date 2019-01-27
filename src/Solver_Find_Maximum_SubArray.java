/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */
import java.io.DataInputStream;
public class Solver_Find_Maximum_SubArray {

    public static void main(String args[]){
        Solve_Find_Maximum_SubArray solve = new Solve_Find_Maximum_SubArray();
        InputReader ir = new InputReader(new DataInputStream(System.in));
        final int length_of_array = ir.readInt();
        int input_array[] = new int[length_of_array];
        for(int i=0;i<length_of_array;i++){
            input_array[i] = ir.readInt();
        }
        System.out.println(solve.getMaxSum(input_array));
    }
}

class Solve_Find_Maximum_SubArray{

    public int getMaxSum(int arr[]){
        return getMaxSubArraySum(arr,0,arr.length-1);
    }
    public int getMaxSubArraySum(int arr[] ,int l,int r){
        if(l == r){
            return arr[l];
        }
        int m = (l+r)/2;
        return max(getMaxSubArraySum(arr,l,m),getMaxSubArraySum(arr,m+1,r),getMaximumCrossSubArray(arr,l,m,r));
    }

    public int getMaximumCrossSubArray(int arr[],int low,int mid ,int high){
        int left_sum =Integer.MIN_VALUE;
        int sum=0;
        for(int i=mid;i>=low;i--){
            sum+=arr[i];
            if(sum>left_sum){

                left_sum=sum;
            }
        }
        int right_sum =Integer.MIN_VALUE;
        sum=0;
        for(int i=mid+1;i<=high;i++){
            sum+=arr[i];
            if(sum>right_sum){

                right_sum=sum;
            }
        }
        return left_sum +right_sum;
    }
    public int max(int a,int b){
        return (a>b?a:b);
    }
    public int max(int a,int b,int c){
        return max(max(a,b),c);
    }
}
