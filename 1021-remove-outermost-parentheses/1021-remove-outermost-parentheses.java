class Solution {
    public String removeOuterParentheses(String s) {
       int counter=0;
       StringBuilder ans=new StringBuilder();
      for (char i :s.toCharArray()){
        if(i=='('){
            if(counter>0)ans.append(i);
            counter++;
        }else if(i==')'){
            counter--;
            if(counter>0)ans.append(i);
        }
      }
       return ans.toString();
    }
}