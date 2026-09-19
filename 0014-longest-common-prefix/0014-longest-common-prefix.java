class Solution {
    public String longestCommonPrefix(String[] strs) {
     Arrays.sort(strs);
    String small=strs[0];
    StringBuilder ans=new StringBuilder();
    String large=strs[strs.length-1];
    for(int i=0;i<Math.min(small.length(),large.length());i++){
        if(small.charAt(i)!=large.charAt(i)){
          return ans.toString();
        }
        ans.append(small.charAt(i));
    }  
    return ans.toString();
    }
}