class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length-1;
        int[] result = {-1,-1};
        if(nums.length == 0){
            return result;
        }
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>=target){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        if(lo >= nums.length || nums[lo] != target){
               return result;
            }
             result[0] = lo;
        hi = nums.length-1;
        while(lo<=hi){
            int mid =lo+(hi-lo)/2;
            if(nums[mid]<=target){
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
                result[1] = hi;
        }
        return result;
    }
}