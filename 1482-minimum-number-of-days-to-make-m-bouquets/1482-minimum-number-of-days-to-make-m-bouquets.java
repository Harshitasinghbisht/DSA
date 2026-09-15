class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
      long totalFlower=(long)m*k;
      int min=Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;
      if(bloomDay.length<totalFlower){
        return -1;
      }  
      for(int i :bloomDay){
        if(min>i){
            min=i;
        }
        if(max<i){
            max=i;
        }
      }
      while(min<=max){
        int mid=min+(max-min)/2;
        int consecutiveFlowers =0;
        int bouquets =0;
        for(int i: bloomDay){
            if(mid>=i){
                consecutiveFlowers ++;
                if(consecutiveFlowers==k){
                    bouquets++;
                    consecutiveFlowers =0;
                }
            }
            else{
                consecutiveFlowers =0;
            }
        }
        if(bouquets>=m){
            max=mid-1;
        }
        else{
            min=mid+1;
        }
      }
      return min;
    }
}