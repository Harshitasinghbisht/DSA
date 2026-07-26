class Solution {
    public int maxArea(int[] height) {
        int maxAns=Integer.MIN_VALUE;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int area=(r-l)*Math.min(height[l],height[r]);
            maxAns=Math.max(maxAns,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
return maxAns;
    }
}