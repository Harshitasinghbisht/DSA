class Solution {
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i:nums ){
            if(low<i){
                low=i;
            }
            high+=i;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int currentSum=0;
            int subArray=1;
            for(int i:nums){
                if(currentSum+i<=mid){
                    currentSum+=i;
                }
                else{
                    subArray++;
                    currentSum=i;
                }
            }
            if(subArray>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}