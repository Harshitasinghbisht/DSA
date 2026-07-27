class Solution {
    public void moveZeroes(int[] nums) {
        int slow=0;
        int fast=0;
        while(fast<nums.length){
            if(nums[fast]!=0){
              swap(nums,slow,fast);
              fast++;
              slow++;
            }
            else{
                fast++;
            }
        }
    }

    public void swap(int []nums,int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}