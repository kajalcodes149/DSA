class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo =0,hi=n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(target == nums[mid]) return mid;
            else if(nums[lo]<=nums[mid]){
                if(nums[lo]<=target && target<nums[mid]){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }

            }
            else{
                if(nums[hi]>=target && target>nums[mid]){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }
        }
        return -1;
        
    }
}