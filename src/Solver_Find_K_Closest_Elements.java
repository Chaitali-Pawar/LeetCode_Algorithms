import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solver_Find_K_Closest_Elements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();

        if(Arrays.binarySearch(arr,x) >0){
            int index = Arrays.binarySearch(arr,x);
            int i = (index-k) <0 ?0:(index-k+1);
            while(i!=index){
                result.add(arr[i]);
                i++;
            }

            int j =  Arrays.binarySearch(arr,x);
            while(result.size()!=k){
                result.add(arr[j]);
                j++;
            }
            return result;
        }
        else{
            int index = binarySearch(arr,0,arr.length-1,x);
            int i = index ==0 ? 0:(index-k) <0?0:(index-k);
            while (result.size()!=k){
                result.add(arr[i]);
                i++;
            }
            return result;
        }

    }
    public int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return l;
    }

}
