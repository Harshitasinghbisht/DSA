class Solution {
    public int removeDuplicates(int[] nums) {
    HashSet<Integer>set=new HashSet<>();
    int count=0;
    for(int i:nums){
        if(!set.contains(i)){
            set.add(i);
            nums[count]=i;
            count++;
        }
    }
return count;
    }
}