class Solution {
    public int triangleNumber(int[] nums) {
        int count =0;
        Arrays.sort(nums);
        for(int k=nums.length-1;k>1;k--){
           int l=0;
           int r=k-1;
           while(l<r){
            if(nums[l]+nums[r]>nums[k]){
            count += r-l;
            r--;
           }
           else{
            l++;
           }
           }
        }
        return count;
    }
}