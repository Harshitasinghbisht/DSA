class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max=0;
        int min=1;
        for(int i : nums){
            if(max<i){
                max=i;
            }
        }

        while(min<=max){
            int mid=min+(max-min)/2;
            long ans=0;
            for(int i :nums){
                ans+=(i+mid-1)/mid;
            }
            if(ans<=threshold){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
     return min;
    }
}