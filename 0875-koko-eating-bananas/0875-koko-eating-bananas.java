class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     int max=0;
     int min=1;
     
   
     for(int i: piles){
        if(max<i){
            max=i;
        }
     }
     while(min<=max){
        int mid=min+(max-min)/2;
        long hr=0;
        for(int i:piles){
           hr+=(i+mid-1)/mid;
        }
        if(hr<=h){
        max=mid-1;
        }
        else{
        min=mid+1;
        }
     }
     return min;
    }
}