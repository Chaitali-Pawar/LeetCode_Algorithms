/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */

import java.util.HashMap;

public class Solver_Two_Sum {

    /*we can use brute force approach where we take an element as pass it across 2 for loops to check if the sum
     is euivalent or not however it wastes memory , thus use one pass hash table where we store the elements
    and use the complement method to identify if the sum of the 2 array indices matches.
    */

}

class Solve_Two_Sum{

    public int [] findTwoSum(int [] inputArray , int target){

        HashMap<Integer,Integer> mapOfInputArray = new HashMap<>();
        for(int i=0;i<inputArray.length;i++){
            mapOfInputArray.put(inputArray[i],i);
        }
        for(int i=0;i<inputArray.length;i++){
            if(mapOfInputArray.containsKey(target - inputArray[i]) && mapOfInputArray.get(target - inputArray[i]) != i ){
                return new int[] { i, mapOfInputArray.get(target - inputArray[i]) };
            }
            mapOfInputArray.put(inputArray[i],i);
        }
        throw new IllegalArgumentException("No 2 indices found");
    }

}