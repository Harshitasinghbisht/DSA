class Solution {
    public int search(int[] nums, int target) {
        int pivot=findpivot(nums,0,nums.length-1);
        int ans=bs(nums,target,0,pivot);
        if(ans!=-1)return ans;
        
        return bs(nums,target,pivot+1,nums.length-1);
        
    }
    public int findpivot(int nums[],int start,int end){
      while(start<=end){
        int mid=start+(end-start)/2;
        if(mid<nums.length-1 && nums[mid]>nums[mid+1]){
            return mid;
        }
        // pivot is in the right
       if (nums[mid] >= nums[start]) {
            start = mid + 1;
        }
        // Pivot is in the left half
        else {
            end = mid - 1;
        }
      }  
      return -1;
    }
    public int bs(int[]nums,int target,int start,int end){
       while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]<target){
            start=mid+1;
        }
        else if(nums[mid]>target){
            end=mid-1;
        }
        else{
           return mid;
        }
      } 
      return -1; 
    }
}