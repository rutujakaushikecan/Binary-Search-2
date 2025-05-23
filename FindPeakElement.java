/*
Binary search

Time : O(log(n))
Space :O(1)
 */
public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int low = 0;

        int n = nums.length;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if((mid == 0 || (nums[mid] > nums[mid -1])) && (mid == n-1 || (nums[mid] > nums[mid+1]))){
                return mid;
            } else if (mid > 0 && nums[mid] < nums[mid - 1]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));

    }
}
