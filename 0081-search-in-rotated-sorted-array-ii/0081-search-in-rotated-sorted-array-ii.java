class Solution {
    public boolean search(int[] nums, int target) {
      
       return bs(nums,target,0,nums.length-1);
    }
   public boolean bs(int[]nums,int target,int start,int end){
    while(start<=end){
       int mid=start+(end-start)/2;
       if(nums[mid]==target){
        return true;
       }
       if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
                continue;
            }
        else if(nums[start]<=nums[mid]){
         if (target >= nums[start] && target < nums[mid]) {
        end = mid - 1;
    } else {
        start = mid + 1;
    }
       }
       else{
          if (target > nums[mid] && target <= nums[end]) {
        start = mid + 1;
    } else {
        end = mid - 1;
    }
       }
    }
    return false;
   }
}