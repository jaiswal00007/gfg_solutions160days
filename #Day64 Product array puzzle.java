// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int res[] = new int[n];
        
        int l[]= new int[n];
        int r[]= new int[n];
        
        l[0]=1;
        for(int i=1;i<n;i++){
            l[i]= arr[i-1] * l[i-1];
        }
        
        r[n-1]=1;
        for(int i=n-2;i>=0;i--){
            r[i]= arr[i+1] *r[i+1];
        }
        
        for(int i=0;i<n;i++){
            res[i]=l[i] * r[i];
        }
        
        return res;
    }
}
