class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int needed=target-current;
            //check if needed is there in list
            if(list.containsKey(needed)){
                return new int[] {list.get(needed),i};
            }
//if not store in list
            list.put(current,i);
           
        }
        return new int[] {};
    }
}