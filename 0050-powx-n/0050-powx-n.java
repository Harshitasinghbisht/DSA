class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        double halfPow = myPow(x, n/2);
        halfPow = halfPow * halfPow;
        if(n%2!=0 && n>0){
            halfPow=x*halfPow; 
        }
        else if(n%2!=0 && n<0){
            halfPow=1/x*halfPow; 
        }
        return halfPow;
    }
}