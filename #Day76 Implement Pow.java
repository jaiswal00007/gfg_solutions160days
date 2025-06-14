// User function Template for Java
class Solution {
    double power(double b, int e) {
        // code here
        if(e==0){
            return 1.0;
        }
        boolean neg=e<0;
        long xp=Math.abs((long)e);
        double res=1.0;
        
        while(xp>0){
            if((xp%2)==1){
                res*=b;
            }
            b*=b;
            xp=xp/2;
        }
        if(neg){
            return 1.0/res;
        }
        else{
            return res;
        }
    }
}
